package com.denissc.controllers;

import com.denissc.models.Model;

import java.util.Set;

/**
 * Controller with CRUD actions
 */
public interface ConsoleController<E> {
    Set<E> findAll();
    void create(E model);
    void update(E model);
    E findById(int id);
    void delete(E model);
}
