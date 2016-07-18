package ua.com.westwind.Denys_HomeWork.module07.app;

import java.util.List;

public interface BusinessTask {

    public void save(Person person);

    public void bulkSave(List<Person> person);

    public List<Person> getAllPersons();

    public Person getPerson(String name);

    public Person getPerson(int age);

    public int getSize();
}
