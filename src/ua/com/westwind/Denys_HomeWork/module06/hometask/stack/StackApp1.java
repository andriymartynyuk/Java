package ua.com.westwind.Denys_HomeWork.module06.hometask.stack;

import java.util.Stack;

/**
 * Created by Администратор on 09.07.2016.
 */
public class StackApp1 {

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("Denis");
        stack.push("Boris");
        stack.push("Piter");
        System.out.println("--------");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("--------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



        for(Object obj:stack){
           // System.out.println(obj);
        }
    }
}
