package com.denissc.dao;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public interface ModelDao<E> {
    Set<E> findAll();

    boolean create(E model);

    boolean update(E model);

    E findById(int id);

    boolean delete(E model);
}
