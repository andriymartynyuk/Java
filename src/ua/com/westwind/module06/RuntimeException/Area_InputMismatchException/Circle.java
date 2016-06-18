package ua.com.westwind.module06.RuntimeException.Area_InputMismatchException;

class Circle implements Shape {
    @Override
    public void calculateArea(double p1, double p2) {
        System.out.println("Circle S =  "+ p1 * (p2 * p2));
    }
}