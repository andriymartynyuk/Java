package ua.com.westwind.module11.module04.Area;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 05.07.2016.
 */
public class TriangleTest {
    @Test
    public void calculateArea() throws Exception {
        final double p1 = 10;
        final double p2 = 15;

        final Triangle triangleArea = new Triangle();

        final double result = triangleArea.calculateArea(p1, p2);

        Assert.assertEquals(75.00, result, 0.001);

    }

}