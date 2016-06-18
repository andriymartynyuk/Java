package ua.com.westwind.module06.RuntimeException;

public class InsertionSortException {
    public static void main(String a[]) {
        int[] arr1 = {6, 35, 5, 65, 8, 12, 32, 123};
        int[] arr2 = doInsertionSort(arr1);
        arr2 = null;

        try{
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
        }catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    private static int[] doInsertionSort(int[] args){
        int temp;
        for (int i = 1; i < args.length; i++) {
            for (int j = i; j > 0; j--) {
                if (args[j] < args[j - 1]) {
                    temp = args[j];
                    args[j] = args[j - 1];
                    args[j - 1] = temp;
                }
            }
        } return args;
    }
}