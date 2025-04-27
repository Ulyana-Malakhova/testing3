package org.example;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Научный калькулятор");
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение матриц");
            System.out.println("2. Вычитание матриц");
            System.out.println("3. Умножение матриц");
            System.out.println("4. Транспонирование матрицы");
            System.out.println("5. Интегрирование функции");
            System.out.println("6. Решение квадратного уравнения");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performMatrixAddition(scanner);
                    break;
                case 2:
                    performMatrixSubtraction(scanner);
                    break;
                case 3:
                    performMatrixMultiplication(scanner);
                    break;
                case 4:
                    performMatrixTranspose(scanner);
                    break;
                case 5:
                    performIntegration(scanner);
                    break;
                case 6:
                    solveQuadraticEquation(scanner);
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void performMatrixAddition(Scanner scanner) {
        System.out.println("Введите размер матриц (например, 2 2 для 2x2):");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        double[][] matrixA = new double[rows][cols];
        double[][] matrixB = new double[rows][cols];

        System.out.println("Введите элементы первой матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Введите элементы второй матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        MatrixCalculator calculator = new MatrixCalculator();
        double[][] result = calculator.add(matrixA, matrixB);
        System.out.println("Результат сложения:");
        printMatrix(result);
    }

    private static void performMatrixSubtraction(Scanner scanner) {
        System.out.println("Введите размер матриц (например, 2 2 для 2x2):");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        double[][] matrixA = new double[rows][cols];
        double[][] matrixB = new double[rows][cols];

        System.out.println("Введите элементы первой матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Введите элементы второй матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        MatrixCalculator calculator = new MatrixCalculator();
        double[][] result = calculator.subtract(matrixA, matrixB);
        System.out.println("Результат вычитания:");
        printMatrix(result);
    }

    private static void performMatrixMultiplication(Scanner scanner) {
        System.out.println("Введите размер первой матрицы (например, 2 3 для 2x3):");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        double[][] matrixA = new double[rowsA][colsA];

        System.out.println("Введите элементы первой матрицы:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Введите размер второй матрицы (например, 3 2 для 3x2):");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        double[][] matrixB = new double[rowsB][colsB];

        System.out.println("Введите элементы второй матрицы:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        MatrixCalculator calculator = new MatrixCalculator();
        double[][] result = calculator.multiply(matrixA, matrixB);
        System.out.println("Результат умножения:");
        printMatrix(result);
    }

    private static void performMatrixTranspose(Scanner scanner) {
        System.out.println("Введите размер матрицы (например, 2 2 для 2x2):");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        double[][] matrix = new double[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        MatrixCalculator calculator = new MatrixCalculator();
        double[][] result = calculator.transpose(matrix);
        System.out.println("Транспонированная матрица:");
        printMatrix(result);
    }

    private static void performIntegration(Scanner scanner) {
        System.out.println("Выберите функцию для интегрирования:");
        System.out.println("1. x^2");
        System.out.println("2. sin(x)");
        System.out.println("3. e^x");

        int functionChoice = scanner.nextInt();
        Function<Double, Double> function;

        switch (functionChoice) {
            case 1:
                function = x -> x * x; // Функция x^2
                break;
            case 2:
                function = Math::sin; // Функция sin(x)
                break;
            case 3:
                function = Math::exp; // Функция e^x
                break;
            default:
                System.out.println("Неверный выбор. Вернемся назад.");
                return;
        }

        System.out.println("Введите границы интегрирования (a, b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        Integrator integrator = new Integrator();
        double result = integrator.integrate(function, a, b, 1000);
        System.out.println("Результат интегрирования: " + result);
    }

    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Введите коэффициенты a, b, c для уравнения ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EquationSolver solver = new EquationSolver();
        double[] roots = solver.solveQuadratic(a, b, c);

        System.out.println("Корни уравнения:");
        if (roots.length == 0) {
            System.out.println("Нет действительных корней.");
        } else {
            for (double root : roots) {
                System.out.println(root);
            }
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}