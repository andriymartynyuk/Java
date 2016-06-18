package ua.com.westwind.module06.RuntimeException.Area_InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Select figure - Triangle: 1, Circle: 2, Square: 3 : ");
            double select = sc.nextDouble();

        if (select == 1) {
            System.out.println("Input h: ");
            double p1 = sc.nextDouble();
            System.out.println("Input a: ");
            double p2 = sc.nextDouble();

            Shape triangeleArea = new Triangle();
            triangeleArea.calculateArea(p1, p2);

        } else if (select == 2) {
            System.out.println("Input R: ");
            double p2 = sc.nextDouble();

            Shape circleArea = new Circle();
            circleArea.calculateArea(Math.PI, p2);
        }
        else {
            System.out.println("Input c: ");
            double p1 = sc.nextDouble();
            System.out.println("Input d: ");
            double p2 = sc.nextDouble();

            Shape squareArea = new Square();
            squareArea.calculateArea(p1, p2);
        }
        } catch (InputMismatchException e){
            System.out.println("Symbol must be: integer or double");
        }
    }
}

