package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human dean;
    private List<Specialty> specialties;
    private List<Group> groups;

    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
        this.specialties = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addSpecialty(Specialty specialty) {
        specialties.add(specialty);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Human getDean() { return dean; }
    public void setDean(Human dean) { this.dean = dean; }
    public List<Specialty> getSpecialties() { return specialties; }
    public List<Group> getGroups() { return groups; }
}