package ua.com.westwind.module06.RuntimeException04.Distance2;
import java.util.Scanner;

public class Distance {
    private static Scanner sc = new Scanner(System.in);
    static int input;
    public static void main(String[] args) {
        System.out.println("Enter an integer number: ");
        try {
            input = Integer.parseInt(sc.next());
            System.out.println("You've entered number: " + input);
            Coordinates points = new BetweenPoints() ;
            points.calcDistance(input,2,5,2);
            }
        catch (NumberFormatException e) {
            System.out.println("You've entered non-integer number");
            System.out.println("This caused " + e);
        }

    }
}
