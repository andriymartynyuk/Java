package ua.com.westwind.Denys_HomeWork.module05.sample1;

import java.io.FileNotFoundException;

/**
 * Created by Администратор on 30.06.2016.
 */
public class Parent {

    public void makeAction() throws Exception {
        System.out.println("Parent.makeAction");
        throw new FileNotFoundException("test");
    }

    public void makeAction1() {
        System.out.println("Parent.makeAction1");
    }

    public void validate() throws NullPointerException {
        System.out.println("Parent.makeAction");
        throw new NullPointerException("test");
    }

}
