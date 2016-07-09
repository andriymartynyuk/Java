package ua.com.westwind.Denys_HomeWork.module06.example.set;

/**
 * Created by Администратор on 09.07.2016.
 */
public class Dog implements Comparable<Dog>{
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog o) {
        //return -(age-o.getAge());
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
