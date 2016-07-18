package ua.com.westwind.Denys_HomeWork.module07.io.inputstream;

import com.app.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 14.07.2016.
 */
public class App2 {

    public static void main(String[] args) throws Exception {
        List<Person> persons = new ArrayList();
        for(int i=0;i<10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("Name"+i);
            persons.add(person);
        }
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("persons1.txt")));) {
            for (Person p : persons) {
                out.writeUTF(p.getName());
                out.writeInt(p.getAge());
            }
        }
        System.out.println("-------Save Completed----------");
        List<Person> list = new ArrayList();
        try(DataInputStream in = new DataInputStream(new FileInputStream(new File("persons1.txt")))){
            boolean needToRun=true;
            while(needToRun){
                try {
                    String name = in.readUTF();
                    int age = in.readInt();
                    Person p = new Person();
                    p.setName(name);
                    p.setAge(age);
                    list.add(p);
                }catch(EOFException ex){
                   // ex.printStackTrace();
                    needToRun=false;
                }
            }
        }
        System.out.println("------Read Completed-----------");
        for(Person p:list){
            System.out.println(p);
        }
    }

}
