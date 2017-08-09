package com.denissc.dao;

import com.denissc.models.Model;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Models DAO crud operations thought file
 */
public abstract class JavaIOModelDAOImpl<E> implements ModelDao<E>{
    final int STRING_LENGTH = 15;
    private String filePath = System.getProperty("user.dir") + "/resources/";
    private RandomAccessFile file;

    JavaIOModelDAOImpl() {
        try {
            file = new RandomAccessFile(new File(getFullFilePath()),"rw");
        } catch (FileNotFoundException e) {
            System.out.println("(FATAL) File not found.");
        }
    }
    private String getFullFilePath(){
        return filePath + getFileName();
    }


    abstract String getFileName();

    @Override
    public Set<E> findAll() {
        Set<E> records = new HashSet<>();
        try {
            long recordsAmount = file.length() / getModelEntitySize();
            for (long i = 1; i <= recordsAmount;i++ ) {
                seekRecord(i);
                records.add(readRecord());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    @Override
    public Set<E> findWhere(ModelCondition<E> condition) {
        Set<E> records = new HashSet<>();
        try {
            long recordsAmount = file.length() / getModelEntitySize();
            for (long i = 1; i <= recordsAmount;i++ ) {
                seekRecord(i);
                E record = readRecord();
                if (condition.isPassesCondition(record)) {
                    records.add(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    /**
     * Return developer founded by id
     * @param recordId developer id
     * @return founded developer or null if it is not founded
     */
    @Override
    public E findById(int recordId) {
        E record = null;
        if (recordId < 1) {
            System.out.println("(INFO) ID parameter is invalid.");
        } else {
            seekRecord(recordId);
            record = readRecord();
        }

        return record;
    }

    abstract E readRecord();

    /**
     * Read string from file
     * @return string
     */
    String readString() throws IOException {
        char[] chars = new char[STRING_LENGTH];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = file.readChar();
        }
        return new String(chars).replace('\0', ' ');
    }

    /**
     * Read integer from file
     * @return integer
     */
    int readInt() throws IOException {
        return file.readInt();
    }

    /**
     * Saves new record to the file
     * @param record new record
     */
    public void create(E record) {
        Model model = (Model)record;
        Model d = (Model)findById(model.getId());
        if (d == null || d.getId() == 0) {
            writeRecord(record);
        } else {
            System.out.printf("(INFO) Record with id %s is exist. skipping.\n",model.getId());
        }
    }

    abstract void writeRecord(E record);

    /**
     * Writes string to file
     * @param string string that will be written to file
     */
    void writeString(String string) throws IOException {
        StringBuffer buffer;
        if (string != null)
            buffer = new StringBuffer(string);
        else
            buffer = new StringBuffer(STRING_LENGTH);
        buffer.setLength(STRING_LENGTH);

        file.writeChars(buffer.toString());

    }

    /**
     * Writes integer to file
     * @param integer integer that will be written to file
     */
    void writeInt(int integer) throws IOException {
        file.writeInt(integer);
    }

    /**
     * Sets offset of file pointer to developer record
     * by its id and calculated length of developer data stored
     * @param id id of developer record in file
     * @return success of seek operation
     */
    private boolean seekRecord(long id) {
        boolean success = false;
        int modelEntitySize = getModelEntitySize();
        long modelEntityOffset = (id - 1) * modelEntitySize;

        try {
            file.seek(modelEntityOffset);
            success = true;
        } catch (IOException e) {
            System.out.println("(INFO) Failed to find record.");
        }
        return success;
    }

    abstract int getModelEntitySize();

    /**
     * Updates existed record by it id, rewrites the file
     * @param record new record data
     */
    public void update(E record) {
        Model model = (Model)record;
        if (model.getId() < 1) {
            System.out.println("(INFO) ID parameter is invalid.");
        } else {
            seekRecord(model.getId());
            writeRecord(record);
        }
    }

    /**
     * Delete existed record, and rewrite the file
     * @param record record
     */
    public void delete(E record) {
        Model model = (Model) record;
        if (model.getId() < 1) {
            System.out.println("(INFO) ID parameter is invalid.");
        } else {
            seekRecord(model.getId());
            writeRecord(null);
        }
    }
}
