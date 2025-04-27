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
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
