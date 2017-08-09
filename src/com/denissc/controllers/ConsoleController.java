package com.denissc.controllers;

import com.denissc.models.Model;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public interface ConsoleController<E> {
    Set<E> findAll();
    void create(E model);
    void update(E model);
    E findById(int id);
    void delete(E model);
}
