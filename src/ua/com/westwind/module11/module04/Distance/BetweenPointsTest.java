package ua.com.westwind.module11.module04.Distance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Admin on 05.07.2016.
 */
public class BetweenPointsTest {
    @Test(timeout = 1000)
    public void calcDistance() throws Exception {
        final int x2 = 5;
        final int x1 = 2;
        final int y2 = 5;
        final int y1 = 2;

        final BetweenPoints betweenPoints = new BetweenPoints();

        final double result = betweenPoints.calcDistance(x2,x1,y2,y1);

        assertEquals(4.2426, result, 0.0001);
    }

}