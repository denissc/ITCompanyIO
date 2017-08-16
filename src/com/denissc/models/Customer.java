package com.denissc.models;

/**
 * Customer entity
 */
public class Customer implements Model{
    private int id;
    private int companyId;
    private String name;

    public Customer(int id) {
        this(id, 0,"");
    }

    public Customer(int id, int companyId, String name) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", name='" + name + '\'' +
                '}';
    }
}
