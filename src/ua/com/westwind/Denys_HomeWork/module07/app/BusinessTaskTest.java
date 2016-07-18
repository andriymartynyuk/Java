package ua.com.westwind.Denys_HomeWork.module07.app;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BusinessTaskTest {
    private BusinessTask businessTask = new BusinessTaskImpl();

    @Test
    public void saveOperationTest(){
        Person person = new Person();
        person.setAge(29);
        person.setName("Denis");
        businessTask.save(person);
        assertTrue(1==businessTask.getSize());
        assertNotEquals(0,businessTask.getSize());
        assertNotSame(0,businessTask.getSize());
    }

    @Test
    public void bulkSaveOperationTest(){
        List<Person> persons = new ArrayList();
        for(int i=0;i<10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("Name"+i);
            persons.add(person);
        }
        businessTask.bulkSave(persons);
        assertTrue(persons.size()==businessTask.getSize());
        assertNotEquals(0,businessTask.getSize());
        assertNotSame(0,businessTask.getSize());
    }

    @Test
    public void getAllPersonsTest(){
        List<Person> persons = new ArrayList();
        for(int i=0;i<10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("Name"+i);
            persons.add(person);
        }
        businessTask.bulkSave(persons);
        assertTrue("persons.size()="+persons.size(), persons.size()==businessTask.getSize());
        assertNotEquals(0,businessTask.getSize());
        assertNotSame(0,businessTask.getSize());
        List<Person> actualPersons=businessTask.getAllPersons();
        for(int i=0;i<actualPersons.size();i++){
            Person actualPerson = actualPersons.get(i);
            Person expectedPerson = persons.get(i);
            assertEquals(actualPerson,expectedPerson);
        }
        Person[] expectedPersonArray=persons.toArray(new Person[0]);
        Person[] actualPersonArray=actualPersons.toArray(new Person[0]);
        assertArrayEquals(expectedPersonArray, actualPersonArray);
    }

    @Test
    public void getPersonByNameTest(){
        String name = "Denis";
        Person person = new Person();
        person.setAge(29);
        person.setName(name);
        businessTask.save(person);
        Person actualPerson=businessTask.getPerson(name);
        assertNotNull(actualPerson);
        assertEquals(person, actualPerson);
        assertEquals(person.getName(), name);
        assertEquals(person.getAge(), person.getAge());
    }

    @Test
    public void getPersonByAgeTest(){
        String name = "Denis";
        Person person = new Person();
        person.setAge(29);
        person.setName(name);
        businessTask.save(person);
        Person actualPerson=businessTask.getPerson(29);
        assertNotNull(actualPerson);
        assertEquals(person, actualPerson);
        assertEquals(person.getName(), name);
        assertEquals(person.getAge(), person.getAge());
    }


    @Test
    public void sizeTest(){
        assertSame("Testing of default size", 0, businessTask.getSize());
        Person person = new Person();
        person.setAge(29);
        person.setName("Denis");
        businessTask.save(person);
        assertTrue("Testing of default size", 1==businessTask.getSize());
    }


}
