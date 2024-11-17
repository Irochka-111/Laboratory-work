package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Human curator;
    private List<Student> students;

    public Group(String name, Human curator) {
        this.name = name;
        this.curator = curator;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Human getCurator() { return curator; }
    public void setCurator(Human curator) { this.curator = curator; }
    public List<Student> getStudents() { return students; }
}