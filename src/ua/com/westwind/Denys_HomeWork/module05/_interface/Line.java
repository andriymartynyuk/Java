package ua.com.westwind.Denys_HomeWork.module05._interface;

/**
 * Created by Администратор on 30.06.2016.
 */
public class Line implements Shape, Color{

    @Override
    public void draw() {
        System.out.println("Line.draw");
    }

    @Override
    public void colorInfo() {
        System.out.println("Line.green");
    }
}
