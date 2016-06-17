package ua.com.westwind.module06.RuntimeException_module05;

public class ArrayException {
    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30, 40, 50};

        try {
              intArray = new int[-5];

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
        } catch (Exception ex){
            System.out.println("NegativeArraySizeException");
            System.out.println(ex.toString());
        }
    }
}