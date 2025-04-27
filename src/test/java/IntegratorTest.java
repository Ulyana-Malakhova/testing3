import org.example.Integrator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegratorTest {
    @Test
    void integratorClassCreationTest(){
        Integrator integrator = new Integrator();
        Assertions.assertNotNull(integrator);
    }
}
