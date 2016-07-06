package ua.com.westwind.module06.HomeWork_Collections;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        //add()
        a1.add("A");
        a1.add("R");
        a1.add("K");
        a1.add("A");

        //ArrayList
        for (String i : a1) {System.out.print(i);}
        System.out.println(" ");
        for (int i = 0; i < a1.size(); i++) {System.out.println(a1.get(i));}

        //a1.size
        System.out.println("\n" + "a1 size = " + a1.size());

        //get index = 2
        String getIndex = a1.get(2);
        System.out.println("get(int index) = " + getIndex);

        //isEmpty()
        if (!(a1.isEmpty()))
            System.out.println("List isn't empty");
        else
            System.out.println("List is empty!");
    }
}
/*  ДЗ - 6
    Самостоятельно написать MyArrayList
        Это должен быть кдасс MyArrayList
        в нем будет массив
        и вы должны имплементировать:
        методы
        как в ArrayList
        add()
        get(int index)
        size()
        isEmpty()*/
