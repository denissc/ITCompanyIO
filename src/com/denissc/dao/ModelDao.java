package com.denissc.dao;

import java.util.Set;

/**
 * CRUD models data access operations
 */
public interface ModelDao<E> {
    Set<E> findAll();

    void create(E model);

    void update(E model);

    E findById(int id);

    void delete(E model);

    Set<E> findWhere(ModelCondition<E> condition);
}
