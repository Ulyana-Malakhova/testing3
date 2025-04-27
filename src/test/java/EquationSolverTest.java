import org.example.EquationSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquationSolverTest {
    @Test
    void equationSolverClassCreationTest(){
        EquationSolver equationSolver = new EquationSolver();
        Assertions.assertNotNull(equationSolver);
    }

    @Test
    void solveQuadraticA1B2C1Test(){
        EquationSolver equationSolver = new EquationSolver();
        Assertions.assertArrayEquals(new double[]{-1},equationSolver.solveQuadratic(1,2,1));
    }

    @Test
    void solveQuadraticA1B1C1Test(){
        EquationSolver equationSolver = new EquationSolver();
        Assertions.assertArrayEquals(new double[0],equationSolver.solveQuadratic(1,1,1));
    }

    @Test
    void solveQuadraticA2B3C2Test(){
        EquationSolver equationSolver = new EquationSolver();
        Assertions.assertArrayEquals(new double[]{2, -0.5},equationSolver.solveQuadratic(2,-3,-2));
    }
}
