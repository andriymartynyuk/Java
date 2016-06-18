package ua.com.westwind.module06.RuntimeException.Area_InputMismatchException;

class Square implements Shape {
    @Override
    public void calculateArea(double p1, double p2) {
        System.out.println("Square S = " + p1 * p2);
    }
}
