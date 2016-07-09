package ua.com.westwind.Denys_HomeWork.module06.example.immutable;

/**
 * Created by Администратор on 07.07.2016.
 */
public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+"hashCode="+hashCode();
    }
}
