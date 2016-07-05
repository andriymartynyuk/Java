package ua.com.westwind.module11.module04.Distance;

class BetweenPoints implements Coordinates {
    @Override
    public double calcDistance(double x2, double x1, double y2, double y1) {
        double betweenPoints  = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Distance_NumberFormatException D = " + betweenPoints);
        return betweenPoints;
    }
}


/*Math.round(betweenPoints*100.0)/100.0);*/
