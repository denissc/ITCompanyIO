package com.denissc.dao;

import com.denissc.models.Developer;
import com.denissc.models.Model;
import com.denissc.models.Team;

import java.io.EOFException;
import java.io.IOException;
import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class TeamDao extends JavaIOModelDAOImpl<Team>{
    @Override
    String getFileName() {
        return "teams.txt";
    }

    @Override
    Team readRecord() {
        int id = 0, projectId = 0;
        String name = "";
        Team team = null;
        try {
            id = readInt();
            projectId = readInt();
            name = readString();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read Project.");
        } finally {
            if (id > 0) {
                team = new Team(id, projectId, name);
            }
        }

        return team;
    }

    @Override
    void writeRecord(Team team) {
        int id, projectId;
        String teamName;
        if (team == null) {
            id = 0;
            projectId = 0;
            teamName = "";
        } else {
            id = team.getId();
            projectId = team.getProjectId();
            teamName = team.getName();
        }

        if (teamName.length() > STRING_LENGTH ) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(id);
                writeInt(projectId);
                writeString(teamName);
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write Team.");
            }
        }

    }

    @Override
    int getModelEntitySize() {
        return 2 * Integer.BYTES + (Character.BYTES * STRING_LENGTH);
    }

    public Set<Developer> findTeamDevelopers(Team team, ModelDao<Developer> developerDao) {
        return developerDao.findWhere((Developer developer) -> developer.getTeamId() == team.getId());
    }
}
