package org.example;


import java.util.function.Function;

public class Integrator {
    /**
     * Метод для интегрирования функуий
     * @param function интегрируемая функция
     * @param a нижний предел интегрирования
     * @param b верхний предел интегрирования
     * @param n количество разбиений интегрирования
     * @return результат интегрирования
     */
    public double integrate(Function<Double, Double> function, double a, double b, int n) {
        double step = (b - a) / n;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double x = a + i * step;
            sum += function.apply(x);
        }

        return sum * step;
    }
}
