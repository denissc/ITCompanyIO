package com.denissc.models;

/**
 * Created by denissc on 05.08.17.
 */
public class Team implements Model{
    private int id;
    private int projectId;
    private String name;

    public Team(int id) {
        this(id,0,"");
    }

    public Team(int id, int projectId, String name) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", name='" + name + '\'' +
                '}';
    }
}
