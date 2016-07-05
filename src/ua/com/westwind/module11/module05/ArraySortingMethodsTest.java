package ua.com.westwind.module11.module05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Admin on 05.07.2016.
 */
public class ArraySortingMethodsTest {


    @Test
    public void sortArray1() throws Exception {
        int[] intArray = new int[]{10, 20, 30, 40, 50};

        ArraySortingMethods arraySorting1 = new ArraySortingMethods();
        final int[] result = arraySorting1.sortArray1(intArray);

        Assert.assertArrayEquals(new int[]{10,50},result);
    }

    @Test
    public void sortArray2() throws Exception {
        int[] intArray = new int[]{10, 20, 30, 40, 50};

        ArraySortingMethods arraySorting2 = new ArraySortingMethods();
        final int[] result = arraySorting2.sortArray2(intArray);

        Assert.assertArrayEquals(new int[]{10,50},result);
    }

    @Test
    public void sortArray3() throws Exception {
        int[] intArray = new int[]{10, 20, 30, 40, 50};

        ArraySortingMethods arraySorting3 = new ArraySortingMethods();
        final int[] result = arraySorting3.sortArray3(intArray);

        Assert.assertArrayEquals(new int[]{10,20,30,40,50},result);
    }

}