package ua.com.westwind.module11.module04.Temperature;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 05.07.2016.
 */
public class CelsiusTest {
    @Test
    public void calcDegrees() throws Exception {
        final double c = 100;

        final Celsius celsium = new Celsius();

        final double result = celsium.calcDegrees(c);

        assertEquals(212, result, 0.1);
    }

}