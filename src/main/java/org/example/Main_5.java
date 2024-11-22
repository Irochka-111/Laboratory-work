package org.example;

import org.example.controller.StudentController_5;
import org.example.model.Student_5;
import java.util.List;
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        StudentController_5 controller = new StudentController_5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВведіть номер місяця (1-12) або 0 для виходу:");
            int month = scanner.nextInt();

            if (month == 0) {
                break;
            }

            if (month < 1 || month > 12) {
                System.out.println("Помилка: Введіть число від 1 до 12");
                continue;
            }

            List<Student_5> students = controller.getStudentsByBirthMonth(month);

            if (students.isEmpty()) {
                System.out.println("У цьому місяці немає студентів з днем народження.");
            } else {
                System.out.println("Студенти, що народилися в " + month + " місяці:");
                students.forEach(System.out::println);
            }
        }
        scanner.close();
    }
}