package com.denissc.models;

/**
 * Created by denissc on 05.08.17.
 */
public class Skill implements Model{
    private int id;
    private int developerId;
    private String name;

    public Skill(int id, int developerId, String name) {
        this.id = id;
        this.developerId = developerId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", developerId=" + developerId +
                ", name='" + name + '\'' +
                '}';
    }
}
