package org.example.controller;

import org.example.model.Human;
import org.example.model.Sex;

public class HumanCreator implements Creator<Human> {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex sex;

    public HumanCreator(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    @Override
    public Human create() {
        return new Human(firstName, lastName, middleName, sex);
    }
}