package ua.com.westwind.module04_2.Area2;
import java.util.Scanner;

public class Area2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Select figure - Triangle: 1, Circle: 2, Square: 3 : ");
        int select = sc.nextInt();
        if (select == 1) {
            System.out.println("Triangle S = a*h/2");
            System.out.print("Input h: ");
            double p1 = sc.nextDouble();
            System.out.print("Input a: ");
            double p2 = sc.nextDouble();

            Figure2 triangeleArea = new Triangle2();
            triangeleArea.calculate(p1,p2);

        } else if (select == 2) {
            double p1 = 3.14;
            System.out.println("Circle S = PI*(R*R)");
            System.out.print("Input R: ");
            double p2 = sc.nextDouble();

            Figure2 circleArea = new Circle2();
            circleArea.calculate(p1,p2);
        }
        else {
            System.out.println("Square S = c*d");
            System.out.print("Input c: ");
            double p1 = sc.nextDouble();
            System.out.print("Input d: ");
            double p2 = sc.nextDouble();

            Figure2 squareArea = new Square2();
            squareArea.calculate(p1,p2);
        }
    }
}
