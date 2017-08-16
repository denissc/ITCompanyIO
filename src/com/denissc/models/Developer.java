package com.denissc.models;

/**
 * Developer entity
 */
public class Developer implements Model{
    private int id;
    private int teamId;
    private String name;
    private String occupation;

    public Developer(int id) {
        this(id,0,"","");
    }

    public Developer(int id, int teamId, String name, String occupation) {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", teamId=" + teamId +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
