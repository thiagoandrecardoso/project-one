package who.programador.projectone.converters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureTest {
    @Test
    public void testCelsiusToFahrenheit() {
        double fahrenheit = Temperature.celsiusToFahrenheit(30);

        assertEquals(86, fahrenheit, 0.0);
    }

    @Test
    public void testFahrenheitToCelsius() {
        double celsius = Temperature.fahrenheitToCelsius(86);

        assertEquals(30, celsius, 0.0);
    }
}
