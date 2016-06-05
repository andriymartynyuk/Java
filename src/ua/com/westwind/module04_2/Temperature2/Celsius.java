package ua.com.westwind.module04_2.Temperature2;

class Celsius implements Calculate {
    @Override
    public void calculate(double c) {
        double f = Math.round((p1 * c + p2)*100.0/100.0);
        System.out.println("F = " +f);
    }
}