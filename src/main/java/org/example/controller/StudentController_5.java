package org.example.controller;

import org.example.model.Student_5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController_5 {
    public List<Student_5> getStudentsByBirthMonth(int month) {
        List<Student_5> students = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE MONTH(birth_date) = ?";

        try (Connection conn = DatabaseConnection_5.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, month);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    students.add(new Student_5(
                            rs.getInt("id"),
                            rs.getString("student_card_number"),
                            rs.getString("last_name"),
                            rs.getString("first_name"),
                            rs.getString("middle_name"),
                            rs.getDate("birth_date").toLocalDate()
                    ));
                }
            }
        } catch (SQLException e) {
            System.err.println("Помилка при отриманні даних: " + e.getMessage());
            e.printStackTrace();
        }
        return students;
    }
}
