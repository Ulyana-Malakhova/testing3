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
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return new double[0]; // Нет действительных корней
        } else if (discriminant == 0) {
            return new double[]{-b / (2 * a)}; // Один корень
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2}; // Два корня
        }
    }
}
