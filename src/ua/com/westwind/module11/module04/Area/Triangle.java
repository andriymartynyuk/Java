package ua.com.westwind.module11.module04.Area;

class Triangle implements Shape {
    @Override
    public double calculateArea(double p1, double p2) {
        double triangleArea = p1 * p2 / 2;
        System.out.println("Triangle S = "+triangleArea);
        return triangleArea;
    }
}
