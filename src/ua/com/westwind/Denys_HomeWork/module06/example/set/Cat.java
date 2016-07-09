package ua.com.westwind.Denys_HomeWork.module06.example.set;

/**
 * Created by Администратор on 09.07.2016.
 */
public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
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
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
*/
        System.out.println("equals()");
        return false;
    }

    @Override
    public int hashCode() {
       /* int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;*/
        return 1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
