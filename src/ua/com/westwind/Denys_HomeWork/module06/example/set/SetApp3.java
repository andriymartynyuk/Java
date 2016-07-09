package ua.com.westwind.Denys_HomeWork.module06.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Администратор on 09.07.2016.
 */
public class SetApp3 {

    public static void main(String[] args){
        Set<Cat> set = new LinkedHashSet();
        Set<Cat> set1 = new HashSet<>();
        Cat cat1 = new Cat("Denys",29);
        Cat cat2 = new Cat("Boris",25);
        Cat cat3 = new Cat("Piter",45);
        System.out.println("cat1.HashCode="+cat1.hashCode());
        System.out.println("cat2.HashCode="+cat2.hashCode());
        System.out.println("cat3.HashCode="+cat3.hashCode());

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(set.size());
        System.out.println(set);
    }
}
