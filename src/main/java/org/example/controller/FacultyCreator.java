package org.example.controller;

import org.example.model.Faculty;
import org.example.model.Human;
import org.example.model.Specialty;
import org.example.model.Group;
import java.util.List;

public class FacultyCreator implements Creator<Faculty> {
    private String name;
    private Human dean;
    private List<Specialty> specialties;
    private List<Group> groups;

    public FacultyCreator(String name, Human dean, List<Specialty> specialties, List<Group> groups) {
        this.name = name;
        this.dean = dean;
        this.specialties = specialties;
        this.groups = groups;
    }

    @Override
    public Faculty create() {
        Faculty faculty = new Faculty(name, dean);
        for (Specialty specialty : specialties) {
            faculty.addSpecialty(specialty);
        }
        for (Group group : groups) {
            faculty.addGroup(group);
        }
        return faculty;
    }
}