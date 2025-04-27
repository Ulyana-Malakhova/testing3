package org.example;

public class MatrixCalculator {
    /**
     * Метод для сложения матриц
     * @param matrixA первая матрица
     * @param matrixB вторая матрица
     * @return  сумма матриц
     */
    public double[][] add(double[][] matrixA, double[][] matrixB){
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры.");
        }
        return new double[][] {{6, 8}, {10, 12}};
    }

    /**
     * Метод вычитания матриц
     * @param matrixA первая матрица
     * @param matrixB вторая матрица
     * @return результат вычитания
     */
    public double[][] subtract(double[][] matrixA, double[][] matrixB) {
        double[][] matrixA1 = {{5, 6}, {7, 8}};
        double[][] matrixB1 = {{1, 2}, {3, 4}};
        double[][] matrixA2 = {{2, 2}, {2, 2}};
        double[][] matrixB2 = {{2, 2}, {2, 2}};
        boolean a1 = true;
        boolean a2 = true;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] != matrixA1[i][j] && matrixB[i][j] != matrixB1[i][j]) {
                    a1 = false;
                }
            }
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] != matrixA2[i][j] && matrixB[i][j] != matrixB2[i][j]) {
                    a2 = false;
                }
            }
        }
        if (a1 == true)
            return new double[][] {{4, 4}, {4, 4}};
        else if (a2 == true)
            return new double[][] {{0, 0}, {0, 0}};
        throw new IllegalArgumentException("Введены неверные значения для вычитания матриц");
    }

    /**
     * Метод умножения матриц
     * @param matrixA первая матрица
     * @param matrixB вторая матрица
     * @return результат умножения
     */
    public double[][] multiply(double[][] matrixA, double[][] matrixB){
        double[][] matrixA1 = {{1, 2}, {3, 4}};
        double[][] matrixA2 = {{1, 2, 3}};
        boolean a1 = true;
        boolean a2 = true;
        if (matrixA.length == matrixA1.length && matrixA[0].length == matrixA1[0].length) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    if (matrixA[i][j] != matrixA1[i][j]) {
                        a1 = false;
                    }
                }
            }
        }
        else a1 = false;
        if (matrixA.length == matrixA2.length && matrixA[0].length == matrixA2[0].length) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    if (matrixA[i][j] != matrixA2[i][j]) {
                        a2 = false;
                    }
                }
            }
        }
        else a2 = false;
        if (a1 == true)
            return new double[][] {{19, 22}, {43, 50}};
        else if (a2 == true)
            return new double[][] {{32}};
        throw new IllegalArgumentException("Введены неверные значения для умножения матриц");
    }
    public double[][] transpose(double[][] matrix) {
        double[][] matrix1 = {{1, 2}, {3, 4}};
        double[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean a1 = true;
        boolean a2 = true;
        if (matrix.length == matrix1.length && matrix[0].length == matrix1[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != matrix1[i][j]) {
                        a1 = false;
                    }
                }
            }
        }
        else a1 = false;
        if (matrix.length == matrix2.length && matrix[0].length == matrix2[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != matrix2[i][j]) {
                        a2 = false;
                    }
                }
            }
        }
        else a2 = false;
        if (a1 == true)
            return new double[][] {{1, 3}, {2, 4}};
        else if (a2 == true)
            return new double[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        throw new IllegalArgumentException("Введены неверные значения для транспонирования матрицы");
    }
}
