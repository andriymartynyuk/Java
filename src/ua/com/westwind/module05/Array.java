package ua.com.westwind.module05;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30, 40, 50};

        for (int i = 0; i < intArray.length; ++i) {
            if (intArray[i] > intArray[i] + 1) {
                int max = intArray[i];
                System.out.println(max+"1");
            }
            else
                {
                int min = intArray[i];
                    System.out.println(min+"2");
                }

        }


    }
}
