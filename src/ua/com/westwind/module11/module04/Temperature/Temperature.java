package ua.com.westwind.module11.module04.Temperature;

public class Temperature {

    public static void main(String[] args) {

            Degrees cel = new Celsius();
            cel.calcDegrees(100);

            Degrees far = new Fahrenheit();
            far.calcDegrees(212);

        }
    }