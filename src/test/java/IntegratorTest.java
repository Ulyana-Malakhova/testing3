import org.example.Integrator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegratorTest {
    @Test
    void integratorClassCreationTest(){
        Integrator integrator = new Integrator();
        Assertions.assertNotNull(integrator);
    }
    @Test
    public void testIntegrationSqrtX(){
        Integrator integrator = new Integrator();
        assertEquals(1.0 / 3.0, integrator.integrate(x -> x * x, 0, 1, 1000), 0.01);
    }
}
