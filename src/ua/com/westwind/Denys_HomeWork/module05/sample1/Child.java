package ua.com.westwind.Denys_HomeWork.module05.sample1;

import java.io.FileNotFoundException;

/**
 * Created by Администратор on 30.06.2016.
 */
public class Child extends Parent{

    @Override
    public void makeAction() throws FileNotFoundException {
        System.out.println("Child.makeAction");
    }

    @Override
    public void makeAction1()  {
        System.out.println("Child.makeAction");
    }

    public void validate() throws NumberFormatException{
        System.out.println("Parent.makeAction");
    }
}
