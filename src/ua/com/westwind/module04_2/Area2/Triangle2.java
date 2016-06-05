package ua.com.westwind.module04_2.Area2;

class Triangle2 implements Calculate {
    @Override
    public void calculate(double p1, double p2) {
        System.out.println("Triangle S = "+p1*p2/2);
    }
}
