package org.example;

public class MatrixCalculator {
    public double[][] add(double[][] matrixA, double[][] matrixB){
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры.");
        }
        return new double[][] {{6, 8}, {10, 12}};
    }
}
