package com.denissc.controllers;

import com.denissc.dao.ProjectDao;
import com.denissc.dao.TeamDao;
import com.denissc.models.Project;
import com.denissc.models.Team;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class ProjectController implements ConsoleController<Project> {
    ProjectDao projectDao = new ProjectDao();
    @Override
    public Set<Project> findAll() {
        return projectDao.findAll();
    }

    @Override
    public void create(Project model) {
        projectDao.create(model);
    }

    @Override
    public void update(Project model) {
        projectDao.update(model);
    }

    @Override
    public Project findById(int id) {
        return projectDao.findById(id);
    }

    public Set<Team> findProjectTeams(Project project) {
        return projectDao.findProjectTeams(project, new TeamDao());
    }

    @Override
    public void delete(Project model) {
        projectDao.delete(model);
    }
}
