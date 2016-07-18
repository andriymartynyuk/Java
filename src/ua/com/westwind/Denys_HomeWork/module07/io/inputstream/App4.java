package ua.com.westwind.Denys_HomeWork.module07.io.inputstream;

import com.app.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 14.07.2016.
 */
public class App4 {

    public static void main(String[] args) throws Exception {
        List<Person> persons = new ArrayList();
        for(int i=0;i<10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("Name"+i);
            persons.add(person);
        }
        try(PrintStream filePrintStream = new PrintStream(new File("persons4.txt"));){
            PrintStream old=System.out;
            System.setOut(filePrintStream);

        for(int i=0;i<10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("Name"+i);
            persons.add(person);
            System.out.println(person);
        }
            System.setOut(old);

        System.out.println("-------Save Completed----------");
        /*try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("persons2.txt")))){
            List<Person> list= (List<Person>) in.readObject();
            System.out.println(list.size());
        }*/
    }}
}
