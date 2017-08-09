package com.denissc.controllers;

import com.denissc.dao.DeveloperDao;
import com.denissc.dao.SkillDao;
import com.denissc.models.Developer;
import com.denissc.models.Skill;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class DeveloperController implements ConsoleController<Developer> {
    DeveloperDao developerDao = new DeveloperDao();
    @Override
    public Set<Developer> findAll() {
        return developerDao.findAll();
    }

    @Override
    public void create(Developer model) {
        developerDao.create(model);
    }

    @Override
    public void update(Developer model) {
        developerDao.update(model);
    }

    @Override
    public Developer findById(int id) {
        return developerDao.findById(id);
    }

    @Override
    public void delete(Developer model) {
        developerDao.delete(model);
    }

    public Set<Skill> findDeveloperSkills(Developer developer) {
        return developerDao.findDeveloperSkills(developer, new SkillDao());
    }
}
