package ua.com.westwind.module11.module04.Area;

public class Area {
    private static double p1 = 3.14;
    public static void main(String[] args) {

            Shape triangeleArea = new Triangle();
            triangeleArea.calculateArea(10,15);

            Shape circleArea = new Circle();
            circleArea.calculateArea(p1,15);

            Shape squareArea = new Square();
            squareArea.calculateArea(10,15);
        }
    }

