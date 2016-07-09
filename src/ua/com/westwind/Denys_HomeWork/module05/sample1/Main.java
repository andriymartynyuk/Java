package ua.com.westwind.Denys_HomeWork.module05.sample1;

import java.io.FileNotFoundException;

/**
 * Created by Администратор on 30.06.2016.
 */
public class Main {

    public static void main(String[] args){
        Parent p = new Child();
        try {
            p.makeAction();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try {
            p.validate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
