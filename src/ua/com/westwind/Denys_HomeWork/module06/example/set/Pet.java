package ua.com.westwind.Denys_HomeWork.module06.example.set;

/**
 * Created by Администратор on 09.07.2016.
 */
public abstract class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {
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
}
