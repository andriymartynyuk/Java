package ua.com.westwind.module06.RuntimeException;
import java.util.Scanner;

public class ArrayException {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Input Array size ");
            int size = sc.nextInt();
            int[] intArray = new int[size];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = ((int) (Math.random() * 10));
            }
            int min = intArray[0];
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
        } catch (NegativeArraySizeException e) {
            System.out.println(e.toString());
        }
    }
}
