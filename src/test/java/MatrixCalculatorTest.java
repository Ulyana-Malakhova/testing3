import org.example.MatrixCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
}
