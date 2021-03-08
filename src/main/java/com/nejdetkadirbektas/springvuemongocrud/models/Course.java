package com.nejdetkadirbektas.springvuemongocrud.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

/**
 * @author nejdetkadirr
 */
@Document
public class Course {

    private String id;
    private String name;
    private String description;
    private String instructor;
    private HashMap goals;

    public Course(String id, String name, String description, String instructor, HashMap goals) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instructor = instructor;
        this.goals = goals;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public HashMap getGoals() {
        return goals;
    }

    public void setGoals(HashMap goals) {
        this.goals = goals;
    }
}
