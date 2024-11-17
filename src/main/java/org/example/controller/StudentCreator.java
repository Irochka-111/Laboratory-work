package org.example.controller;

import org.example.model.Student;
import org.example.model.Sex;

public class StudentCreator implements Creator<Student> {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex sex;
    private String studentId;

    public StudentCreator(String firstName, String lastName, String middleName, Sex sex, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
        this.studentId = studentId;
    }

    @Override
    public Student create() {
        return new Student(firstName, lastName, middleName, sex, studentId);
    }
}