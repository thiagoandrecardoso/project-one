package who.programador.projectone.calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImcTest {
    @Test
    public void testCalculate() {
        double imc = Imc.calculate(70, 1.75);
        // The expected value is 22.86
        // The third parameter is the delta value, which is the maximum difference between the expected and the actual value
        // If the difference is greater than the delta value, the test will fail
        assertEquals(22.86, imc, 0.01);
    }
}
