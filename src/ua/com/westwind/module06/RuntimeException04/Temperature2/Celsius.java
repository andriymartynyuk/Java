package ua.com.westwind.module06.RuntimeException04.Temperature2;

class Celsius implements Degrees {
    @Override
    public void calcDegrees(double c) {
        double f = Math.round((p1 * c + p2)*100.0/100.0);
        System.out.println("F = " +f);
    }
}