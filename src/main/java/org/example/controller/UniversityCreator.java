package org.example.controller;

import org.example.model.University;
import org.example.model.Human;
import org.example.model.Faculty;
import java.util.List;

public class UniversityCreator implements Creator<University> {
    private String name;
    private Human rector;
    private List<Faculty> faculties;

    public UniversityCreator(String name, Human rector, List<Faculty> faculties) {
        this.name = name;
        this.rector = rector;
        this.faculties = faculties;
    }

    @Override
    public University create() {
        University university = new University(name, rector);
        for (Faculty faculty : faculties) {
            university.addFaculty(faculty);
        }
        return university;
    }
}