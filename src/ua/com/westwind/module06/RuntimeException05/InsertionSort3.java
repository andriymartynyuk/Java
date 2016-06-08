package ua.com.westwind.module06.RuntimeException05;

public class InsertionSort3 {
    public static void main(String a[]) {
        int[] arr1 = {9, 35, 5, 65, 8, 12, 32, 123};
        int[] arr2 = doInsertionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private static int[] doInsertionSort(int[] input) {

        int temporery;
        input = null;
        try {
            for (int i = 1; i < input.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (input[j] < input[j - 1]) {
                        temporery = input[j];
                        input[j] = input[j - 1];
                        input[j - 1] = temporery;
                    }
                }
            }

        } catch (Exception ex) {
            System.out.println("NullPointerException");
            System.out.println(ex.toString());
        } return input;
    }
}
