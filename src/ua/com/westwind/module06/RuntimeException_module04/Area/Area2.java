package ua.com.westwind.module06.RuntimeException_module04.Area;

public class Area2 {
    private static double p1 = 3.14;

        public static void main(String[] args) {
            try {
                double p1 = 10/0;

                Shape triangeleArea = new Triangle2();
                triangeleArea.calculateArea(10, 15);

                Shape circleArea = new Circle2();
                circleArea.calculateArea(p1, 15);

                Shape squareArea = new Square2();
                squareArea.calculateArea(10, 15);
            }
            catch(Exception ex)
            {
                System.out.println("ArithmeticException: / by zero");
                System.out.println(ex.toString());
            }
        }
}

