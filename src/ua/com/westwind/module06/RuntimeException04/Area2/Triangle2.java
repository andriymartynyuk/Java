package ua.com.westwind.module06.RuntimeException04.Area2;

class Triangle2 implements Shape {
    @Override
    public void calculateArea(double p1, double p2) {
        System.out.println("Triangle S = "+p1*p2/2);
    }
}
