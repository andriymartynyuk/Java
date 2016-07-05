package ua.com.westwind.module11.module04.Area;

class Circle implements Shape {
    @Override
    public double calculateArea(double p1, double p2) {
        double circleArea = p1 * (p2 * p2);
        System.out.println("Circle S =  "+circleArea);
                return circleArea;

    }
}