package ua.com.westwind.module04.Area;

abstract class Figure {
    double dim1;
    double dim2;
    Figure(double p1, double p2){
        dim1=p1;
        dim2=p2;
    }
    abstract double area();
}