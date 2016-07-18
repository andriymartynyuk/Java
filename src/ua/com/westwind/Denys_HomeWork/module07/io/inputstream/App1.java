package ua.com.westwind.Denys_HomeWork.module07.io.inputstream;

import com.app.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 14.07.2016.
 */
public class App1 {

    public static void main(String[] args) throws Exception {
        List<Person> persons = new ArrayList();
        for(int i=0;i<10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("Name"+i);
            persons.add(person);
        }
        try(OutputStream out = new FileOutputStream(new File("persons.txt"));) {
            for (Person p : persons) {
                String message = p.toString();
                out.write(message.getBytes());
                out.write("\n".getBytes());
            }
        }
        System.out.println("-------Save Completed----------");
        try(InputStream in = new FileInputStream(new File("persons.txt"))){
            byte[] data = new byte[in.available()];
            in.read(data);
            String allPersons = new String(data);
            //System.out.println(allPersons);
            List<Person> list=transform(allPersons);
            System.out.println(list.size());
        }
    }


    private static List<Person> transform(String allPersons){
        List<Person> list = new ArrayList();
        String[] personItems = allPersons.split("\n");
        for(String item: personItems){
            Person person=transformUniuePerson(item);
            list.add(person);
        }
        return list;
    }

    private static Person transformUniuePerson(String personItem){
        int nameStart=personItem.indexOf("name='")+"name='".length();
        int nameEnd=personItem.indexOf("'", nameStart);
        String name = personItem.substring(nameStart, nameEnd);
        //System.out.println(name);
        int ageStart=personItem.indexOf("age=")+"age=".length();
        int ageEnd=personItem.indexOf("}", ageStart);
        int age = Integer.parseInt(personItem.substring(ageStart, ageEnd));
        Person p = new Person();
        p.setAge(age);
       // System.out.println(age);
        p.setName(name);
        return p;
    }
}
