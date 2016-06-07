package ua.com.westwind.module05;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30, 40, 50};
        Arrays.sort(intArray);
        int i = intArray.length-1;
        System.out.println("Min value of array: "+intArray[0]);
        System.out.println("Max velue of array: "+intArray[i]);
    }
}