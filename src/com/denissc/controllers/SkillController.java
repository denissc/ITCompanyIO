package com.denissc.controllers;

import com.denissc.dao.SkillDao;
import com.denissc.models.Skill;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class SkillController implements ConsoleController<Skill> {
    SkillDao skillDao = new SkillDao();

    @Override
    public Set<Skill> findAll() {
        return skillDao.findAll();
    }

    @Override
    public void create(Skill model) {
        skillDao.create(model);
    }

    @Override
    public void update(Skill model) {
        skillDao.update(model);
    }

    @Override
    public Skill findById(int id) {
        return skillDao.findById(id);
    }

    @Override
    public void delete(Skill model) {
        skillDao.delete(model);
    }
}
