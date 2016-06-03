package ua.com.westwind.module04.Area;

class Square extends Figure{
    Square(double p1, double p2){
        super(p1,p2);
    }
    double area(){
        System.out.println("S = "+dim1*dim2);
        return 0;
    }
}
