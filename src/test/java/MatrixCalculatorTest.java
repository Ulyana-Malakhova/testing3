import org.example.MatrixCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixCalculatorTest {
    @Test
    void matrixCalculatorClassCreationTest(){
        MatrixCalculator matrixCalculator = new MatrixCalculator();
        Assertions.assertNotNull(matrixCalculator);
    }

    @Test
    public void testMatrixAddition() {
        MatrixCalculator calculator = new MatrixCalculator();
        double[][] matrixA = {{1, 2}, {3, 4}};
        double[][] matrixB = {{5, 6}, {7, 8}};
        double[][] expected = {{6, 8}, {10, 12}};

        double[][] result = calculator.add(matrixA, matrixB);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMatrixAdditionDifferentSizes() {
        MatrixCalculator calculator = new MatrixCalculator();
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        double[][] matrixB = {{7, 8}, {9, 10}};

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.add(matrixA, matrixB);
        });
    }

    @Test
    public void testMatrixSubtraction() {
        MatrixCalculator calculator = new MatrixCalculator();
        double[][] matrixA = {{5, 6}, {7, 8}};
        double[][] matrixB = {{1, 2}, {3, 4}};
        double[][] expected = {{4, 4}, {4, 4}};

        double[][] result = calculator.subtract(matrixA, matrixB);
        assertArrayEquals(expected, result);
    }
}
