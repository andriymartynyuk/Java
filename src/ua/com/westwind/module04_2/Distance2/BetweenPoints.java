package ua.com.westwind.module04_2.Distance2;

class BetweenPoints implements Calculate {
    @Override
    public void calculate(double x2, double x1, double y2, double y1) {
        double p1 = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        double p2 = Math.sqrt(p1);
        System.out.println("Distance D = "+Math.round(p2*100.0)/100.0);
    }
}