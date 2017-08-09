package com.denissc.dao;

import com.denissc.models.Skill;

import java.io.EOFException;
import java.io.IOException;

/**
 * Created by denissc on 05.08.17.
 */
public class SkillDao extends JavaIOModelDAOImpl<Skill> {
    @Override
    String getFileName() {
        return "skills.txt";
    }

    @Override
    Skill readRecord() {
        int id = 0, developerId = 0;
        String name = "";
        Skill skill = null;
        try {
            id = readInt();
            developerId = readInt();
            name = readString();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read Skill.");
        } finally {
            if (id > 0) {
                skill = new Skill(id, developerId, name);
            }
        }

        return skill;
    }

    @Override
    void writeRecord(Skill skill) {
        int id, teamId;
        String name;
        if (skill == null) {
            id = 0;
            teamId = 0;
            name = "";
        } else {
            id = skill.getId();
            teamId = skill.getDeveloperId();
            name = skill.getName();
        }

        if (name.length() > STRING_LENGTH) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(id);
                writeInt(teamId);
                writeString(name);
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write Skill.");
            }
        }

    }

    @Override
    int getModelEntitySize() {
        return 2 * Integer.BYTES + (Character.BYTES * STRING_LENGTH);
    }
}
