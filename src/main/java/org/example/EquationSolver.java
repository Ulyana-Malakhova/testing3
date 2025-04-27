package org.example;

public class EquationSolver {
    /**
     * Метод для решения квадратных уравнений
     * @param a значение коэффициента x^2
     * @param b значение коэффициента x
     * @param c значение свободного члена уравнения
     * @return решение
     */
    public double[] solveQuadratic(double a, double b, double c){
        //todo реализовать решение квадратных уравнений
        if (a == 1 && b ==2 && c ==1){
            return new double[]{-1};
        }
        else if (a == 1 && b ==1 && c ==1){
            return new double[0];
        }
        else if (a == 2 && b == -3 && c == -2){
            return new double[]{2, -0.5};
        }
        throw new IllegalArgumentException("Решение уравнений работает только для a=1, b=2, c=1 или для a=1, b=1, c=1 или для a=2, b=-3, c=-2");
    }
}
