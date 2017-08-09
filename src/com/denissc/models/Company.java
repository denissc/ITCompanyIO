package com.denissc.models;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class Company implements Model{
    private int id;
    private String name;

    public Company(int id) {
        this(id, "");
    }

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
