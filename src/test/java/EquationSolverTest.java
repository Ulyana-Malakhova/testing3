import org.example.EquationSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquationSolverTest {
    @Test
    void equationSolverClassCreationTest(){
        EquationSolver equationSolver = new EquationSolver();
        Assertions.assertNotNull(equationSolver);
    }
}
