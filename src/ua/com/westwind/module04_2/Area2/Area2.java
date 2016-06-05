package ua.com.westwind.module04_2.Area2;

public class Area2 {
    private static double p1 = 3.14;
    public static void main(String[] args) {

            Calculate triangeleArea = new Triangle2();
            triangeleArea.calculate(10,15);

            Calculate circleArea = new Circle2();
            circleArea.calculate(p1,15);

            Calculate squareArea = new Square2();
            squareArea.calculate(10,15);
        }
    }

