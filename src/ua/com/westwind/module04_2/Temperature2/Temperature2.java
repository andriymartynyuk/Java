package ua.com.westwind.module04_2.Temperature2;

public class Temperature2 {

    public static void main(String[] args) {

            Calculate cel = new Celsius();
            cel.calculate(100);

            Calculate far = new Fahrenheit();
            far.calculate(212);

        }
    }