package ua.com.westwind.module04_2.Temperature2;

class Fahrenheit implements Degrees {
    @Override
    public void calcDegrees(double c) {
        double f = Math.round(((c-p2)/p1)*100.0/100.0);
        System.out.println("C = "+f);
    }
}
