package ua.com.westwind.Denys_HomeWork.module06.property.change.listener;

/**
 * Created by Администратор on 09.07.2016.
 */
public class Main1 {

    public static void main(String[] args){
      Student student = new Student(29,"Denis");
        StudentListener listener= new StudentListener();
        student.addListener(listener);
        System.out.println("1."+student);
        student.setName("Boris");
        System.out.println("2."+student);
        student.setAge(25);
        System.out.println("3."+student);
        System.out.println("------------------");
        Phone phone = new Phone("Htc");
        phone.addListener(listener);
      phone.setTitle("Apple");
    }

}
