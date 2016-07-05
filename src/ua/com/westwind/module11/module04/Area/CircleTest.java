package ua.com.westwind.module11.module04.Area;

import org.junit.Assert;

import static org.junit.Assert.*;


/**
 * Created by Admin on 05.07.2016.
 */
public class CircleTest {
    @org.junit.Test
    public void calculateArea() throws Exception {
        final double p1 = 3.14;
        final double p2 = 15;

        final Circle circleArea = new Circle();

        final double result = circleArea.calculateArea(p1, p2);

        Assert.assertEquals(706.50, result, 0.0001);
    }

}