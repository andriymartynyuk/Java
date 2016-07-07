package ua.com.westwind.module11.module04.Temperature;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 05.07.2016.
 */
public class FahrenheitTest {
    @Test(timeout = 1000)
    public void calcDegrees() throws Exception {
        final double c = 212;

        final Fahrenheit fahrenheits = new Fahrenheit();

        final double result = fahrenheits.calcDegrees(c);

        assertEquals(100, result, 0.1);
    }

}