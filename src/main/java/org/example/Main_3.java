package org.example;

import org.example.controller.*;
import org.example.model.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Main_3 {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println("Університет створено: " + university.getName());

        // Виведення інформації про університет
        System.out.println("\nРектор: " + university.getRector().getLastName() + " "
                + university.getRector().getFirstName() + " "
                + university.getRector().getMiddleName());

        for (Faculty faculty : university.getFaculties()) {
            System.out.println("\nФакультет: " + faculty.getName());
            System.out.println("Декан: " + faculty.getDean().getLastName() + " "
                    + faculty.getDean().getFirstName() + " "
                    + faculty.getDean().getMiddleName());

            for (Specialty specialty : faculty.getSpecialties()) {
                System.out.println("\nСпеціальність: " + specialty.getName());
                System.out.println("Завідувач: " + specialty.getHead().getLastName() + " "
                        + specialty.getHead().getFirstName() + " "
                        + specialty.getHead().getMiddleName());
            }

            for (Group group : faculty.getGroups()) {
                System.out.println("\nГрупа: " + group.getName());
                System.out.println("Куратор: " + group.getCurator().getLastName() + " "
                        + group.getCurator().getFirstName() + " "
                        + group.getCurator().getMiddleName());
                System.out.println("Студенти групи:");
                for (Student student : group.getStudents()) {
                    System.out.println("- " + student.getLastName() + " "
                            + student.getFirstName() + " "
                            + student.getMiddleName());
                }
            }
        }
    }

    public static University createTypicalUniversity() {
        // Create rector
        Human rector = new HumanCreator("Олександр", "Азюковський", "Олександрович", Sex.MALE).create();

        // Create dean
        Human dean = new HumanCreator("Михайло", "Алексєєв", "Олександрович", Sex.MALE).create();

        // Create specialty head
        Human specialtyHead = new HumanCreator("Тімур", "Желдак", "Анатолійович", Sex.MALE).create();

        // Create curator
        Human curator = new HumanCreator("Андрій", "Мартиненко", "Андрійович", Sex.MALE).create();

        // Create students
        Student student1 = new StudentCreator("Ірина", "Чепурна", "Олександрівна", Sex.FEMALE, "ST001").create();
        Student student2 = new StudentCreator("Генадій", "Носов", "Петрович", Sex.MALE, "ST002").create();
        Student student3 = new StudentCreator("Анастасія", "Олександрова", "Олександрівна", Sex.FEMALE, "ST003").create();
        Student student4 = new StudentCreator("Ілля", "Чумаченко", "Сергійович", Sex.MALE, "ST004").create();
        Student student5 = new StudentCreator("Галина", "Галька", "Петрівна", Sex.FEMALE, "ST005").create();

        // Create groups
        Group group1 = new GroupCreator("124-21-2", curator, Arrays.asList(student1, student2, student5)).create();
        Group group2 = new GroupCreator("124-21-1", curator, Arrays.asList(student3, student4)).create();

        // Create specialty
        Specialty specialty = new SpecialtyCreator("Системний аналіз", specialtyHead).create();

        // Create faculty
        Faculty faculty = new FacultyCreator("Інформаційні технології", dean,
                Arrays.asList(specialty),
                Arrays.asList(group1, group2)).create();

        // Create university
        return new UniversityCreator("Дніпровська політехніка", rector,
                Arrays.asList(faculty)).create();
    }
}