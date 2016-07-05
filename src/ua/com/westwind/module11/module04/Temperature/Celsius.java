package ua.com.westwind.module11.module04.Temperature;

class Celsius implements Degrees {
    @Override
    public double calcDegrees(double c) {
        double calcCelsium = p1 * c + p2;
        System.out.println("F = " + calcCelsium);
        return calcCelsium;
    }
}