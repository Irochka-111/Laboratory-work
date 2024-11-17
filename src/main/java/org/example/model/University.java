package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human rector;
    private List<Faculty> faculties;

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Human getRector() { return rector; }
    public void setRector(Human rector) { this.rector = rector; }
    public List<Faculty> getFaculties() { return faculties; }
}