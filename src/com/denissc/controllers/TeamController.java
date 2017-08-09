package com.denissc.controllers;

import com.denissc.dao.DeveloperDao;
import com.denissc.dao.TeamDao;
import com.denissc.models.Developer;
import com.denissc.models.Team;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class TeamController implements ConsoleController<Team> {
    TeamDao teamDao = new TeamDao();
    @Override
    public Set<Team> findAll() {
        return teamDao.findAll();
    }

    @Override
    public void create(Team model) {
        teamDao.create(model);
    }

    @Override
    public void update(Team model) {
        teamDao.update(model);
    }

    @Override
    public Team findById(int id) {
        return teamDao.findById(id);
    }

    @Override
    public void delete(Team model) {
        teamDao.delete(model);
    }

    public Set<Developer> findTeamDevelopers(Team team) {
        return teamDao.findTeamDevelopers(team, new DeveloperDao());
    }
}
