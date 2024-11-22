package org.example.model;

import java.time.LocalDate;

public class Student_5 {
    private int id;
    private String studentCardNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;

    public Student_5(int id, String studentCardNumber, String lastName,
                     String firstName, String middleName, LocalDate birthDate) {
        this.id = id;
        this.studentCardNumber = studentCardNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getStudentCardNumber() { return studentCardNumber; }
    public void setStudentCardNumber(String studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    @Override
    public String toString() {
        return String.format("Студент: %s %s %s, Дата народження: %s, № залікової: %s",
                lastName, firstName, middleName, birthDate, studentCardNumber);
    }
}
