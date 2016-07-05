package ua.com.westwind.module11.module05;


public class InputArray {

    public static int[] intArray = new int[]{10, 20, 30, 40, 50};

    public static void main(String[] args) {

        SortingMethods first = new ArraySortingMethods();
        first.sortArray1(intArray);

        SortingMethods second = new ArraySortingMethods();
        second.sortArray2(intArray);

        SortingMethods third = new ArraySortingMethods();
        third.sortArray3(intArray);

    }
}
