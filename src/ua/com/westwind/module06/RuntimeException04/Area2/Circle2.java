package ua.com.westwind.module06.RuntimeException04.Area2;

class Circle2 implements Shape {
    @Override
    public void calculateArea(double p1, double p2) {
        System.out.println("Circle S =  "+ p1 * (p2 * p2));
    }
}