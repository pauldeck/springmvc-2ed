package com.example.model;

public class Member {
    private int id;
    private String name;
    public Member(int idArg, String nameArg) {
        this.id = idArg;
        this.name = nameArg;
    }

    public int getId() {
        return id;
    }
    public void setId(int idArg) {
        this.id = idArg;
    }

    public String getName() {
        return name;
    }
    public void setName(String nameArg) {
        this.name = nameArg;
    }
}
