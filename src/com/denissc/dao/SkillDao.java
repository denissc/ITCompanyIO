package com.denissc.dao;

import com.denissc.models.Model;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class SkillDao implements ModelDao {

    @Override
    public Set<Model> findAll() {
        return null;
    }

    @Override
    public boolean create(Model model) {
        return false;
    }

    @Override
    public boolean update(Model model) {
        return false;
    }

    @Override
    public Model findById(int id) {
        return null;
    }

    @Override
    public boolean delete(Model model) {
        return false;
    }
}
