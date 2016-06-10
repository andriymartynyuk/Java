package ua.com.westwind.module06.RuntimeException04.Temperature2;

public class Temperature2 {

    public static void main(String[] args) {
        double c=0;
        double f=212;

            if (c == 0) {
                throw new IllegalArgumentException("Value of 'c' are '0'");
            }
            Degrees cel = new Celsius();
            cel.calcDegrees(c);

            Degrees far = new Fahrenheit();
            far.calcDegrees(f);

        }
    }

/*
    Double f(Double a, Double b) {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("arguments of f() are null");
        }
        //...
        return a / b;
    }*/
