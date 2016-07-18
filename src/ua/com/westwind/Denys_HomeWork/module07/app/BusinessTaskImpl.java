package ua.com.westwind.Denys_HomeWork.module07.app;

import java.util.ArrayList;
import java.util.List;

public class BusinessTaskImpl implements BusinessTask{
    private List<Person> data = new ArrayList();

    public void save(Person person) {
        data.add(person);
    }

    public void bulkSave(List<Person> persons) {
        data.addAll(persons);
    }

    public List<Person> getAllPersons() {
        return data;
    }

    public Person getPerson(String name) {
        for(Person person:data){
            if(person!=null){
                if(person.getName().equals(name)){
                    return person;
                }
            }
        }
        return null;
    }

    public Person getPerson(int age) {
        EnumSingleton.INSTANCE.m1("getPerson(age):"+age);
        for(Person person:data){
            if(person!=null){
                if(person.getAge()==age){
                    return person;
                }
            }
        }
        return null;
    }

    public int getSize() {
        return data.size();
    }
}
