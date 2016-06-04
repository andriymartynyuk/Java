package ua.com.westwind.module04_2.Temperature2;

public class Celsius extends Calculate {
    @Override
    public void calculate(double c, double p1, double p2) {
        /*super.calculate(c);*/
        System.out.println("F = "+p1*c+p2);
    }

}
