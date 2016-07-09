package ua.com.westwind.Denys_HomeWork.module06.reflection;

/**
 * Created by Администратор on 09.07.2016.
 */
public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance(){
        if(instance==null){
            instance = new MySingleton();
        }
        return instance;
    }

}
