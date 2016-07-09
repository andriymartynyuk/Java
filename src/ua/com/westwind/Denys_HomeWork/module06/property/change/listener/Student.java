package ua.com.westwind.Denys_HomeWork.module06.property.change.listener;

import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by Администратор on 09.07.2016.
 */
public class Student {
    private String name;
    private int age;
    private PropertyChangeSupport support = new SwingPropertyChangeSupport(this);

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        support.firePropertyChange("name",this.name, name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        support.firePropertyChange("age",this.age, age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
