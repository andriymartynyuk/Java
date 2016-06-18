package ua.com.westwind.module06.RuntimeException.Temperature_throw_new;

class Celsius implements Degrees {
    @Override
    public void calcDegrees(double t) {
        double c = Math.round((p1 * t + p2) * 100.0 / 100.0);
        System.out.println("F = " + c);
    }

}