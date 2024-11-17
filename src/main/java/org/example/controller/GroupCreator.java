package org.example.controller;

import org.example.model.Group;
import org.example.model.Human;
import org.example.model.Student;
import java.util.List;

public class GroupCreator implements Creator<Group> {
    private String name;
    private Human curator;
    private List<Student> students;

    public GroupCreator(String name, Human curator, List<Student> students) {
        this.name = name;
        this.curator = curator;
        this.students = students;
    }

    @Override
    public Group create() {
        Group group = new Group(name, curator);
        for (Student student : students) {
            group.addStudent(student);
        }
        return group;
    }
}