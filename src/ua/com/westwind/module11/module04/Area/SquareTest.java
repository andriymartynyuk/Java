package ua.com.westwind.module11.module04.Area;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 05.07.2016.
 */
public class SquareTest {
    @Test(timeout = 1000)
    public void calculateArea() throws Exception {
        final double p1 = 10;
        final double p2 = 15;

        final Square squareArea = new Square();

        final double result = squareArea.calculateArea(p1, p2);

        Assert.assertEquals(150.00, result, 0.1);
    }

}