package ua.com.westwind.module04_2.Temperature2;
import java.util.Scanner;

public class Temperature2 {
    private static Scanner sc = new Scanner(System.in);
    static final double p1= 1.80;
    static final double p2= 32.00;
    public static void main(String[] args) {
        System.out.print("Select method.  Celsium_to_Faringate: 1, Faringate_to_Celsium: 2 ");
        int select = sc.nextInt();
        if (select == 1){
            System.out.print("Input C: ");
            double c = sc.nextDouble();

            Calculate cel = new Celsius();
            cel.calculate(c,p1,p2);

        } else if (select == 2)
        {
            System.out.print("Input F: ");
            double c = sc.nextDouble();

            Calculate far = new Farenheit();
            far.calculate(c,p1,p2);

        }
    }
}
