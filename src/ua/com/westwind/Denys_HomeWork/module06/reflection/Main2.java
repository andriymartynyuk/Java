package ua.com.westwind.Denys_HomeWork.module06.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Администратор on 09.07.2016.
 */
public class Main2 {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        MySingleton mySingleton=MySingleton.getInstance();
        System.out.println(mySingleton.hashCode());
        MySingleton mySingleton1=MySingleton.getInstance();
        System.out.println(mySingleton1.hashCode());
        Constructor[] constructors=MySingleton.class.getDeclaredConstructors();
        Constructor defaultConstructor=constructors[0];
        System.out.println(constructors.length);
        System.out.println(defaultConstructor);
        //MySingleton mySingleton2 = new MySingleton();
        defaultConstructor.setAccessible(true);
        MySingleton mySingleton2= (MySingleton) defaultConstructor.newInstance();
        System.out.println(mySingleton2.hashCode());
    }
}
