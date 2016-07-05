package ua.com.westwind.module11.module04.Area;

class Square2 implements Shape {
    @Override
    public void calculateArea(double p1, double p2) {
        System.out.println("Square S = " + p1 * p2);
    }
}
