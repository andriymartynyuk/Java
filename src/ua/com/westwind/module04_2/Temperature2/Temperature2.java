package ua.com.westwind.module04_2.Temperature2;

public class Temperature2 {

    public static void main(String[] args) {

            Degrees cel = new Celsius();
            cel.calcDegrees(100);

            Degrees far = new Fahrenheit();
            far.calcDegrees(212);

        }
    }