package com.denissc.dao;

import com.denissc.models.Model;
import com.denissc.models.Project;
import com.denissc.models.Team;

import java.io.EOFException;
import java.io.IOException;
import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class ProjectDao extends JavaIOModelDAOImpl<Project> {
    @Override
    String getFileName() {
        return "projects.txt";
    }

    @Override
    Project readRecord() {
        int id = 0, customerId = 0;
        String name = "";
        Project project = null;
        try {
            id = readInt();
            customerId = readInt();
            name = readString();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read Project.");
        } finally {
            if (id > 0) {
                project = new Project(id, customerId, name);
            }
        }

        return project;
    }

    @Override
    void writeRecord(Project customer) {
        int id, customerId;
        String projectName;
        if (customer == null) {
            id = 0;
            customerId = 0;
            projectName = "";
        } else {
            id = customer.getId();
            customerId = customer.getCustomerId();
            projectName = customer.getName();
        }

        if (projectName.length() > STRING_LENGTH ) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(id);
                writeInt(customerId);
                writeString(projectName);
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write Project.");
            }
        }

    }

    @Override
    int getModelEntitySize() {
        return 2 * Integer.BYTES + (Character.BYTES * STRING_LENGTH);
    }

    public Set<Team> findProjectTeams(Project project, ModelDao<Team> projectModelDao) {
        return projectModelDao.findWhere((Team team) -> team.getProjectId() == project.getId());
    }
}
