package org.example;

import java.util.Scanner;

public class Main_2 {
    // Константи для діапазону рандомних чисел
    private static final int MIN_RANDOM = -100;
    private static final int MAX_RANDOM = 100;
    private static final int MAX_SIZE = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = null;

        while (matrix == null) {
            matrix = createMatrix(scanner);
        }

        printMatrix(matrix);
        displayStatistics(matrix);
        scanner.close();
    }

    private static int[][] createMatrix(Scanner scanner) {
        int rows, cols;

        while (true) {
            System.out.println("Введіть розмір матриці (не більше " + MAX_SIZE + "):");
            System.out.print("Висота: ");
            rows = getValidSize(scanner);

            if (rows == -1) {
                System.out.println("Некоректний розмір матриці! Спробуйте ще раз.\n");
                continue;
            }

            System.out.print("Ширина: ");
            cols = getValidSize(scanner);

            if (cols == -1) {
                System.out.println("Некоректний розмір матриці! Спробуйте ще раз.\n");
                continue;
            }

            break;
        }

        while (true) {
            System.out.println("\nОберіть спосіб заповнення матриці:");
            System.out.println("1 - Ручне введення");
            System.out.println("2 - Випадкові числа");

            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    return createManualMatrix(scanner, rows, cols);
                } else if (choice == 2) {
                    return createRandomMatrix(rows, cols);
                } else {
                    System.out.println("Некоректний вибір! Спробуйте ще раз.\n");
                }
            } catch (Exception e) {
                System.out.println("Некоректний ввід! Спробуйте ще раз.\n");
                scanner.nextLine(); // Очищення буфера
            }
        }
    }

    private static int getValidSize(Scanner scanner) {
        try {
            int size = scanner.nextInt();
            if (size <= 0 || size > MAX_SIZE) {
                return -1;
            }
            return size;
        } catch (Exception e) {
            scanner.nextLine(); // Очищення буфера
            return -1;
        }
    }

    private static int[][] createManualMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("\nВведіть елементи матриці:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        System.out.printf("Елемент [%d][%d]: ", i, j);
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Некоректний ввід! Спробуйте ще раз.");
                        scanner.nextLine(); // Очищення буфера
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = MIN_RANDOM + (int)(Math.random() *
                        (MAX_RANDOM - MIN_RANDOM + 1));
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("\nМатриця:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%6d", element);
            }
            System.out.println();
        }
    }

    private static void displayStatistics(int[][] matrix) {
        int min = matrix[0][0];
        int max = matrix[0][0];
        double sum = 0;
        double product = 1.0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                min = Math.min(min, element);
                max = Math.max(max, element);
                sum += element;
                product *= element;
                count++;
            }
        }

        System.out.println("\nСтатистика:");
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.printf("Середнє арифметичне: %.2f%n", sum / count);

        // Розрахунок середнього геометричного
        double geometricMean = Math.pow(Math.abs(product), 1.0 / count);
        System.out.printf("Середнє геометричне: %.2f%n", geometricMean);
    }
}