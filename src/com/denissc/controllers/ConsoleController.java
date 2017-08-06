package com.denissc.controllers;

import com.denissc.models.Model;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public interface ConsoleController {
    Set<Model> findAll();
    void create(Model model);
    void update(Model model);
    Model findById(int id);
    void delete(Model model);
}
