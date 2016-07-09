package ua.com.westwind.Denys_HomeWork.module06.example.immutable;

import java.util.Collection;

/**
 * Created by Администратор on 07.07.2016.
 */
public class PersonApp {

    public static void main(String[] args){
        Person p = new Person("Denis",29);
        System.out.println(p);
        p.setName("Jack");
        p.setAge(33);
        System.out.println(p);


        Employee emp = new Employee("Denis",29);
        System.out.println(emp);

        String s="abca";
        String res=s.replaceAll("a","Q");
        System.out.println(s);
        System.out.println(res);
        Integer i = 1;

    }

}
