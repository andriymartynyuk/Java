package ua.com.westwind.module04_2.Area2;

class Circle2 extends Figure2 {
    @Override
    public void calculate(double p1, double p2) {
        /*super.calculate();*/
        System.out.println("S =  "+ p1 * (p2 * p2));
    }
}