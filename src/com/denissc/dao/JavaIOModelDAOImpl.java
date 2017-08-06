package com.denissc.dao;

import models.Developer;

import java.io.*;

/**
 * models.Developer DAO crud operations thought file
 */
public abstract class JavaIOModelDAOImpl<E> implements ModelDao<E>{
    private final int STRING_LENGTH = 15;
    private RandomAccessFile file;
    protected String filePath = System.getProperty("user.dir") + "/resources/developers.txt";

    /**
     * Returns new class instance
     */
    public JavaIOModelDAOImpl() {
//        String filePath = System.getProperty("user.dir") + "/resources/developers.txt";
        try {
            file = new RandomAccessFile(new File(filePath),"rw");
        } catch (FileNotFoundException e) {
            System.out.println("(FATAL) File not found.");
        }
    }

    /**
     * Return developer founded by id
     * @param developerId developer id
     * @return founded developer or null if it is not founded
     */
    @Override
    public Developer findById(int developerId) {
        Developer developer = null;
        if (developerId < 1) {
            System.out.println("(INFO) Developer not exists.");
        } else {
            seekRecord(developerId);
            developer = readDeveloper();
            if (developer.getId() == 0)
                developer = null;
        }

        return developer;
    }

    /**
     * Read developer data from file
     * @return developer from file
     */
    private Developer readDeveloper() {
        int id = 0, age = 0;
        String name = "", occupation = "";
        try {
            id = readInt();
            name = readString();
            occupation = readString();
            age = readInt();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read developer.");
        }

        return new Developer(id,name,occupation,age);
    }

    /**
     * Read string from file
     * @return string
     */
    private String readString() throws IOException {
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
    private int readInt() throws IOException {
        return file.readInt();
    }

    /**
     * Saves new developer to the file
     * @param developer new developer
     */
    @Override
    public void save(Developer developer) {
        Developer d = findById(developer.getId());
        if (d == null || d.getId() == 0) {
            writeDeveloper(developer);
        } else {
            System.out.printf("(INFO) Developer with id %s is exist. skipping.\n",developer.getId());
        }
    }

    /**
     * Write developer data to file
     * @param developer -that witll be written to file
     */
    private void writeDeveloper(Developer developer) {
        if (developer.getName().length() > STRING_LENGTH ||
                developer.getOccupation().length() > STRING_LENGTH) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(developer.getId());
                writeString(developer.getName());
                writeString(developer.getOccupation());
                writeInt(developer.getAge());
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write developer.");
            }
        }

    }

    /**
     * Writes string to file
     * @param string string that will be written to file
     */
    private void writeString(String string) throws IOException {
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
    private void writeInt(int integer) throws IOException {
        file.writeInt(integer);
    }

    /**
     * Sets offset of file pointer to developer record
     * by its id and calculated length of developer data stored
     * @param id id of developer record in file
     * @return success of seek operation
     */
    private boolean seekRecord(int id) {
        boolean success = false;
        int modelEntitySize = getModelEntitySize();
        int modelEntityOffset = (id - 1) * modelEntitySize;

        try {
            file.seek(modelEntityOffset);
            success = true;
        } catch (IOException e) {
            System.out.println("(INFO) Failed to find developer.");
        }
        return success;
    }

    abstract int getModelEntitySize();

    /**
     * Updates existed developer by it id, rewrites the file
     * @param developer new developer data
     */
    @Override
    public void update(Developer developer) {
        if (developer.getId() < 1) {
            System.out.println("(INFO) Developer not exists.");
        } else {
            seekRecord(developer.getId());
            writeDeveloper(developer);
        }
    }

    /**
     * Delete existed developer, and rewrite the file
     * @param developer developer
     */
    @Override
    public void delete(Developer developer) {
        if (developer.getId() < 1) {
            System.out.println("(INFO) Developer not exists.");
        } else {
            seekRecord(developer.getId());
            writeDeveloper(new Developer(0,"","",0));
        }
    }
}
