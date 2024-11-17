package org.example.model;

public class Specialty {
    private String name;
    private Human head;

    public Specialty(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Human getHead() { return head; }
    public void setHead(Human head) { this.head = head; }
}
