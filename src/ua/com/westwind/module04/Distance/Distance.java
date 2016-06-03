package ua.com.westwind.module04.Distance;
import java.util.Scanner;

public class Distance {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input x1,y1,x2,y2 to find distance between points: ");

        System.out.println("Input x1 ");
        int x1 = sc.nextInt();
        System.out.println("Input y1 ");
        int y1 = sc.nextInt();
        System.out.println("Input x2 ");
        int x2 = sc.nextInt();
        System.out.println("Input y2 ");
        int y2 = sc.nextInt();

        int p1 = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        double p2 = Math.sqrt(p1);
        System.out.println("Distance D = "+p2);
        System.out.println("Round Distance D = "+Math.round(p2*100.0)/100.0);
    }
}
