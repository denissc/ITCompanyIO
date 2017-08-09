package com.denissc.models;

/**
 * Created by denissc on 05.08.17.
 */
public class Project implements Model{
    private int id;
    private int customerId;
    private String name;

    public Project(int id) {
        this(id,0,"");
    }

    public Project(int id, int customerId, String name) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", name='" + name + '\'' +
                '}';
    }
}
