package ua.com.westwind.Denys_HomeWork.module06.example.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Администратор on 09.07.2016.
 */
public class SetApp2 {

    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(4);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println("---------Cat HashSet--------------------");
        Set<Cat> set1 = new HashSet<>();
        Cat cat1 = new Cat("Denys",29);
        Cat cat2 = new Cat("Boris",25);
        Cat cat3 = new Cat("Piter",45);
        System.out.println("cat1.HashCode="+cat1.hashCode());
        System.out.println("cat2.HashCode="+cat2.hashCode());
        System.out.println("cat3.HashCode="+cat3.hashCode());
        //[],[],[],[],[],[],[]
        // []-->{Cat1},{Cat2},{},{},...
        set1.add(cat1);
        set1.add(cat2);
        set1.add(cat3);
        System.out.println(set1.size());
        System.out.println(set1);

        System.out.println("---------Cat HashMap--------------------");
        Map<Cat, String> catMap = new HashMap();
        catMap.put(cat1, "Cat1");
        catMap.put(cat2, "Cat2");
        catMap.put(cat3, "Cat3");
        for(Cat cat:catMap.keySet()){
            System.out.println(cat+"="+ catMap.get(cat));
        }
    }

}
