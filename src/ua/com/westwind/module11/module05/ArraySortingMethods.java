package ua.com.westwind.module11.module05;

import java.util.Arrays;

public class ArraySortingMethods implements SortingMethods {

    // Min/Max value of array first method
    @Override
    public void sortArray1(int[] intArray) {
        Arrays.sort(intArray);
        int i = intArray.length - 1;
        System.out.println("Min/Max value of array FIRST method");
        System.out.println(intArray[0]);
        System.out.println(intArray[i]);
    }

    // Min/Max value of array second method
    @Override
    public void sortArray2(int[] intArray) {
            int min = intArray[0];
            System.out.println("Min/Max value of array SECOND method");
            for (int x = 0; x < intArray.length; x++) {
                if (min > intArray[x]) {
                    min = intArray[x];
                }
            }
            System.out.println(min);

            int max = intArray[0];
            for (int x = 0; x < intArray.length; x++) {
                if (max < intArray[x]) {
                    max = intArray[x];
                }
            }
            System.out.println(max);
        }

    // Sorting array with InsertionSort method
    @Override
    public void sortArray3(int[] intArray) {
        int[] arr2 = doInsertionSort(intArray);
        System.out.println("Sorting array with InsertionSort method");
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private static int[] doInsertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}