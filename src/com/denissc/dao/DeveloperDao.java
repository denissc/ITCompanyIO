package com.denissc.dao;

import com.denissc.models.Developer;
import com.denissc.models.Model;
import com.denissc.models.Skill;

import java.io.EOFException;
import java.io.IOException;
import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class DeveloperDao extends JavaIOModelDAOImpl<Developer> {
    @Override
    String getFileName() {
        return "developers.txt";
    }

    @Override
    Developer readRecord() {
        int id = 0, projectId = 0;
        String name = "", occupation = "";
        Developer team = null;
        try {
            id = readInt();
            projectId = readInt();
            name = readString();
            occupation = readString();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read Project.");
        } finally {
            if (id > 0) {
                team = new Developer(id, projectId, name, occupation);
            }
        }

        return team;
    }

    @Override
    void writeRecord(Developer team) {
        int id, teamId;
        String developerName,developerOccupation;
        if (team == null) {
            id = 0;
            teamId = 0;
            developerName = "";
            developerOccupation = "";
        } else {
            id = team.getId();
            teamId = team.getTeamId();
            developerName = team.getName();
            developerOccupation = team.getOccupation();
        }

        if (developerName.length() > STRING_LENGTH || developerOccupation.length() > STRING_LENGTH) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(id);
                writeInt(teamId);
                writeString(developerName);
                writeString(developerOccupation);
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write Developer.");
            }
        }

    }

    @Override
    int getModelEntitySize() {
        return 2 * Integer.BYTES + ( 2 * (Character.BYTES * STRING_LENGTH));
    }

    public Set<Skill> findDeveloperSkills(Developer developer, ModelDao<Skill> skillModelDao) {
        return skillModelDao.findWhere((Skill skill) -> skill.getDeveloperId() == developer.getId());
    }
}
