package ua.com.westwind.module04_2.Temperature2;

public class Farenheit extends Calculate {
    @Override
    public void calculate(double c, double p1, double p2) {
        /*super.calculate(c, p1, p2);*/
        System.out.println("C = "+(c-p2)/p1);
    }
}
