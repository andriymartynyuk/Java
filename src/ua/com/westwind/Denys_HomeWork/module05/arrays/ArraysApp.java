package ua.com.westwind.Denys_HomeWork.module05.arrays;

import java.io.IOException;
import java.util.Arrays;

public class ArraysApp {
    //public static int[] a1=null;
    public static int[] a1;

    public static void main(String[] args){
        String[] array = new String[]{"A","B","C"};
        System.out.println("------default array text represenatation-------------");
        System.out.println(array);
        System.out.println(array.toString());

        System.out.println("------My array text represenatation-------------");
        String strArray = "[";
        for(int i=0;i<array.length;i++){
                strArray+=array[i];
                if(i!=array.length-1) {
                    strArray = strArray + ",";
                }
        }
        strArray+="]";
        System.out.println(strArray);

        System.out.println("------Arrays array text represenatation-------------");
        System.out.println(array);
        String textArray=Arrays.toString(array);
        System.out.println(textArray);
        System.out.println(Arrays.toString(array));
        System.out.println("------Arrays array hashCode-------------");

        int[] intArray = new int[7];
        System.out.println(intArray.hashCode());
        int hashCode1=Arrays.hashCode(intArray);
        System.out.println(hashCode1);

        intArray[0] =10;
        System.out.println(intArray.hashCode());
        int hashCode2=Arrays.hashCode(intArray);
        System.out.println(hashCode2);

        int[] sourceData = new int[]{1,2,3,4,5,6,7,8,9,10};
        //int[] destinationData = new int[5];
        //destinationData[0]=1;

        System.out.println("----------------Arrays.copy---------");
        int[] destinationData=Arrays.copyOf(sourceData,9);
        System.out.println(Arrays.toString(destinationData));
        for(int i=0;i<sourceData.length;i++){
            if(i==destinationData.length) {
                break;
            }
            destinationData[i] = sourceData[i];
        }
        System.out.println(Arrays.toString(destinationData));

        System.out.println("----------------System.arrayCopy---------");
        int[] copyData = new int[5];
        System.out.println(Arrays.toString(copyData));
        System.arraycopy(sourceData,1,copyData,3,2);
        System.out.println(Arrays.toString(copyData));

    }







    public static void bigStringArrayContinueBreak() throws IOException {
        String [][] array = new String[4][];


        System.out.println("------Init of big array----------");
        System.out.println(array.hashCode());
        String[] array0 = array[0];
        array0 = new String[]{"A0","B0","C0","D0"};
        array[0] = array0;
        System.out.println(array0.hashCode());
        String[] array1 = array[1];
        array1 = new String[]{"A1","B1","C1"};
        array[1] = array1;
        System.out.println(array0.hashCode());
        String[] array2 = array[2];
        array2 = new String[]{"A2","B2","C2"};
        array[2] = array2;
        System.out.println(array2.hashCode());
        String[] array3 = array[3];
        array3 = new String[]{"A3","B3","C3"};
        array[3] = array3;
        System.out.println(array3.hashCode());
        System.out.println(array.hashCode());
        System.out.println("------Init of big array----------");



        System.out.println("------Iterating over big array----------");
        //int n=4;
        int n = array.length;
        for(int i=0;i<n;i++){
            String[] smallArray = array[i];
            //System.out.println(smallArray);
            System.out.println("Array#"+i);
            for(int j=0;j<smallArray.length;j++){
                String currentItem = smallArray[j];
                System.out.println("currentItem="+currentItem);
                if(currentItem!=null && currentItem.startsWith("A")){
                    //break;
                    //j++;
                    continue;
                    //j++;
                }
                System.out.println("After checking:"+currentItem);
            }
        }

        System.out.println("-------&&; &-----------");
        System.out.println("-------&&-----------");
        if(validate("Denis") && validate("Boris")){
            System.out.println("Is valid");
        }
        System.out.println("-------&-----------");
        if(validate("Denis") & validate("Boris")){
            System.out.println("Is valid");
        }

        System.out.println("-------||; |-----------");
        System.out.println("-------||-----------");
        if(validate("QDenis") || validate("Boris")){
            System.out.println("Is valid");
        }
        System.out.println("-------|-----------");
        if(validate("QDenis") | validate("Boris")){
            System.out.println("Is valid");
        }

        //System.out.println("-------^-----------");
        System.out.println("-------^-----------");
        if(validate("QDenis") ^ validate("QBoris")){
            System.out.println("Is valid");
        }
        System.out.println("-------^-----------");
        if(validate("QDenis") ^ validate("Boris")){
            System.out.println("Is valid");
        }
        System.out.println("-------^-----------");
        if(validate("Denis") ^ validate("QBoris")){
            System.out.println("Is valid");
        }
        System.out.println("-------^-----------");
        if(validate("Denis") ^ validate("Boris")){
            System.out.println("Is valid");
        }
    }

    private static boolean validate(String text){
        System.out.println("validate("+text+")");
        return text!=null && text.startsWith("Q");
    }



















    public static void whileLoopWithIntArray(){
        //int[] array = new int[4];
        //int array[] = new int[4];
        int array[] = new int[]{23,44,56,10};
        /*for(int i=0;i<array.length;i++){
            array[i]=i*5;
        }*/


        int i=0;
        System.out.println("------While index iteration------------");
        while(i<array.length){
            System.out.println(array[i]);
            i++;
        }
        System.out.println("------++------------");
        int j=0;
        System.out.println(j++);
        System.out.println(j);
        System.out.println("------++------------");
        int k=0;
        System.out.println(++k);
        System.out.println(k);

        i=0;
        System.out.println("------While index iteration------------");
        while(i<array.length){
            System.out.println(array[i++]);
        }

        i=-1;
        System.out.println("------While index iteration------------");
        while(++i<array.length){
            System.out.println(array[i]);
        }

        System.out.println("------While infinity loop------------");
        int counter = 0;
        while(true){
            counter++;
            if(counter<100000){
                continue;
            }
            if(counter>200000){
                break;
            }
            System.out.println("infinity.counter="+counter);
        }

        System.out.println("------While BYTE loop------------");
        byte number = 1;
        while(number>=0){
            System.out.println("------Number="+number);
            number++;
        }

        System.out.println("------While BYTE loop------------");
        number = 0;
        while(number<=0){
            System.out.println("------Number="+number);
            number--;
        }

        // forLoopIntArray();
    }

    public static void forLoopIntArray() throws IOException {
        int[] array = new int[4];
        System.out.println(array.hashCode());
        array[0]=123;
        System.out.println(array.hashCode());
        System.out.println(a1);
        System.out.println("------Index iteration------------");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("------Index iteration------------");
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
        System.out.println("------For each iteration------------");
        for(int item:array){
            System.out.println(item);
        }
        System.out.println("------Index revert------------");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        System.out.println("------Index revert------------");
        for(int i=array.length;i>0;i--){
            System.out.println(array[i-1]);
        }
        /*System.out.println("------Infinity loop------------");
        for(;;){
            System.out.println("Infinity Loop");
        }*/
        /*System.out.println("------Infinity loop------------");
        for(Runtime.getRuntime().exec("calc.exe");true;System.out.println("Hello")){
            System.out.println("Infinity Loop");
        }*/
        System.out.println("------Break in loop------------");
        for(int item:array){
            System.out.println(item);
            if(item>100){
                System.out.println("Break condition");
                break;
            }

        }
        System.out.println("------Continue in loop------------");
        for(int item:array){
            if(item>100){
                System.out.println("Continue condition");
                continue;
            }
            System.out.println(item);
        }



    }





}
