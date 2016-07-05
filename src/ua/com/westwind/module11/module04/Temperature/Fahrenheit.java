package ua.com.westwind.module11.module04.Temperature;

class Fahrenheit implements Degrees {
    @Override
    public double calcDegrees(double c) {
        double calcFahrenheit = (c-p2)/p1;
        System.out.println("C = "+ calcFahrenheit);
        return calcFahrenheit;
    }
}
