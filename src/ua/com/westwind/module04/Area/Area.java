package ua.com.westwind.module04.Area;
import java.util.Scanner;

public class Area {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Select figure - Triangle: 1, Circle: 2, Square: 3 : ");
        int select = sc.nextInt();
        if (select == 1) {
            System.out.println("The area of a triangle S = a*h/2");
            System.out.print("Input h: ");
            double p1 = sc.nextDouble();
            System.out.print("Input a: ");
            double p2 = sc.nextDouble();

            Triangle triangeleArea = new Triangle(p1,p2);
            triangeleArea.area();

        } else if (select == 2) {
            double p1 = 3.14;
            System.out.println("The area of a Circle S = PI*(R*R)");
            System.out.print("Input R: ");
            double p2 = sc.nextDouble();

            Circle circleArea = new Circle(p1, p2);
            circleArea.area();
        }
        else {
            System.out.println("The area of a Square S = c*d");
            System.out.print("Input c: ");
            double p1 = sc.nextDouble();
            System.out.print("Input d: ");
            double p2 = sc.nextDouble();

            Square squareArea = new Square(p1,p2);
            squareArea.area();
        }
    }
}
