package ua.com.westwind.module04_2.Temperature2;

class Celsius implements Calculate {
    @Override
    public void calculate(double c, double p1, double p2) {
        System.out.println("F = " + p1 * c + p2);
    }
}