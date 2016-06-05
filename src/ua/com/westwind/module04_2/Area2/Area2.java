package ua.com.westwind.module04_2.Area2;

public class Area2 {
    private static double p1 = 3.14;
    public static void main(String[] args) {

            Shape triangeleArea = new Triangle2();
            triangeleArea.calculateArea(10,15);

            Shape circleArea = new Circle2();
            circleArea.calculateArea(p1,15);

            Shape squareArea = new Square2();
            squareArea.calculateArea(10,15);
        }
    }

