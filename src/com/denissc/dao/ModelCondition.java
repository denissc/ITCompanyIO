package com.denissc.dao;

/**
 * Condition that can be passed or not by a record
 */
public interface ModelCondition<E> {
    boolean isPassesCondition(E record);
}
