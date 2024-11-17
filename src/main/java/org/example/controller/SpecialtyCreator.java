package org.example.controller;

import org.example.model.Specialty;
import org.example.model.Human;

public class SpecialtyCreator implements Creator<Specialty> {
    private String name;
    private Human head;

    public SpecialtyCreator(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public Specialty create() {
        return new Specialty(name, head);
    }
}