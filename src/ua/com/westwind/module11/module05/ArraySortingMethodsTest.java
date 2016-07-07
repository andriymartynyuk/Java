package ua.com.westwind.module11.module05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 05.07.2016.
 */
public class ArraySortingMethodsTest {
    private int[] intArray = new int[]{10, 20, 30, 40, 50};

    @Test(timeout = 1000)
    public void sortArray1() throws Exception {

        ArraySortingMethods arraySorting1 = new ArraySortingMethods();
        final int[] result = arraySorting1.sortArray1(intArray);

        assertArrayEquals(new int[]{10,50},result);
    }

    @Test(timeout = 1000)
    public void sortArray2() throws Exception {

        ArraySortingMethods arraySorting2 = new ArraySortingMethods();
        final int[] result = arraySorting2.sortArray2(intArray);

        assertArrayEquals(new int[]{10,50},result);
    }

    @Test(timeout = 1000)
    public void sortArray3() throws Exception {

        ArraySortingMethods arraySorting3 = new ArraySortingMethods();
        final int[] result = arraySorting3.sortArray3(intArray);

        assertArrayEquals(new int[]{10,20,30,40,50},result);
    }
}