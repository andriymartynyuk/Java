package ua.com.westwind.module11.module04.Area;

class Square implements Shape {
    @Override
    public double calculateArea(double p1, double p2) {
        double squareArea = p1 * p2;
        System.out.println("Square S = "+squareArea);
        return squareArea;
    }
}
