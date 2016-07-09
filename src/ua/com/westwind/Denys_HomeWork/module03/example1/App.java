package ua.com.westwind.Denys_HomeWork.module03.example1;

public class App {

    public static void main(String[] args){
        Person p = new Person();
        System.out.println("Name="+p.getName());
        System.out.println("Age="+p.getAge());
        p.setAge(29);
        p.setName("Denys");
        System.out.println(String.format("Name=%s",p.getName()));
        System.out.println(String.format("Age=%s",p.getAge()));
    }
}
