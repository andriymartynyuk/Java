package ua.com.westwind.module06.RuntimeException.Temperature_throw_new;

class Fahrenheit implements Degrees {
    @Override
    public void calcDegrees(double t) {
        double f = Math.round(((t-p2)/p1)*100.0/100.0);
        System.out.println("C = "+f);

    }
}
