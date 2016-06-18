package ua.com.westwind.module06.RuntimeException.Temperature_throw_new;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {
    private static Scanner sc = new Scanner(System.in);
    static final double p1 = 1.80;
    static final double p2 = 32.00;

    public static void main(String[] args) {
        System.out.println("Select method.  Celsium_to_Faringate: 1, Faringate_to_Celsium: 2 ");
        int select = sc.nextInt();

        if (select == 1) {
            System.out.println("Input C: ");
            double t = sc.nextDouble();
            Degrees cel = new Celsius();
            cel.calcDegrees(t);

        } else if (select == 2) {
            System.out.println("Input F: ");
            double t = sc.nextDouble();
            Degrees far = new Fahrenheit();
            far.calcDegrees(t);
        } else {
            try {
                throw new InputMismatchException();
            } catch (Exception e) {
                System.out.println("Incorrect Input"+e);
                System.exit(0);
            }
        }

    }
}