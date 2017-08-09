package com.denissc.dao;

/**
 * Created by denissc on 09.08.17.
 */
public interface ModelCondition<E> {
    boolean isPassesCondition(E record);
}
