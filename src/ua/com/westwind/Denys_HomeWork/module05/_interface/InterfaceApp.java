package ua.com.westwind.Denys_HomeWork.module05._interface;

/**
 * Created by Администратор on 30.06.2016.
 */
public class InterfaceApp {

    public static void main(String[] args){
        Shape shape = getShape(2);
        shape.draw();
        Color color = getColor(2);
        color.colorInfo();
    }

    public static Shape getShape(int type){
        switch(type){
            case 0:
                return new Line();
            case 1:
                return new Rectangle();
            case 2:
                return new Circle();
            default:
                throw new RuntimeException("Incorrect type:"+type);
        }
    }

    public static Color getColor(int type){
        switch(type){
            case 0:
                return new Line();
            case 1:
                return new Rectangle();
            case 2:
                return new Circle();
            default:
                throw new RuntimeException("Incorrect type:"+type);
        }
    }

}
