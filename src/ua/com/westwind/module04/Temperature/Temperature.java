package ua.com.westwind.module04.Temperature;
import java.util.Scanner;

public class Temperature {
    private static Scanner sc = new Scanner(System.in);
    static final float p1= 1.8f;
    static final int p2= 32;
    public static void main(String[] args) {
        System.out.print("Select covertation method.  Celsium_to_Faringate: 1, Faringate_to_Celsium: 2 ");
        int select = sc.nextInt();
        if (select == 1){
            System.out.println("Celsium_to_Faringate");
            System.out.print("Input C: ");
            double c = sc.nextDouble();
            double f=p1*c+p2;
            System.out.println("F = "+ Math.round(f*100.0)/100.0);
        } else if (select == 2)
        {
            System.out.println("Faringate_to_Celsium");
            System.out.print("Input F: ");
            double f = sc.nextDouble();
            double c=(f-p2)/p1;
            System.out.println("C = "+ Math.round(c*100.0)/100.0);
        }
    }
}
