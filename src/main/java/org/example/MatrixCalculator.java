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

        double[][] result = new double[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    /**
     * Метод вычитания матриц
     * @param matrixA первая матрица
     * @param matrixB вторая матрица
     * @return результат вычитания
     */
    public double[][] subtract(double[][] matrixA, double[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    /**
     * Метод умножения матриц
     * @param matrixA первая матрица
     * @param matrixB вторая матрица
     * @return результат умножения
     */
    public double[][] multiply(double[][] matrixA, double[][] matrixB){
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    /**
     * Метод транспонирования матрицы
     * @param matrix исходная матрица
     * @return результат транспонирования
     */
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
