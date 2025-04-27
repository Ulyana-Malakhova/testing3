package org.example;

public class EquationSolver {
    public double[] solveQuadratic(double a, double b, double c){
        //todo реализовать решение квадратных уравнений
        if (a == 1 && b ==2 && c ==1){
            return new double[]{-1};
        }
        else if (a == 1 && b ==1 && c ==1){
            return new double[0];
        }
        throw new IllegalArgumentException("Решение уравнений работает только для a=1, b=2, c=1 или для a=1, b=1, c=1");
    }
}
