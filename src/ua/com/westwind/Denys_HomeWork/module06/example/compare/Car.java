package ua.com.westwind.Denys_HomeWork.module06.example.compare;

/**
 * Created by Администратор on 07.07.2016.
 */
public class Car implements Comparable<Car>{
    private String color;
    private int price;
    private int age;

    public Car(String color, int price, int age) {
        this.color = color;
        this.price = price;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return age-o.age;
    }
}
