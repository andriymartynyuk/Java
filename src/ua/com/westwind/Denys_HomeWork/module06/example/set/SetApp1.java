package ua.com.westwind.Denys_HomeWork.module06.example.set;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Администратор on 09.07.2016.
 */
public class SetApp1 {

    public static void main(String[] args){
        System.out.println("--------TreeSet------------");
        Set<Integer> set = new TreeSet();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(7);
        set.add(-10);
        //set.add("Denis");
        //set.add("Boris");
        //set.add("Piter");
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println("--------------------");
        Set<Dog> set1 = new TreeSet();
        set1.add(new Dog("Name1",1));
        set1.add(new Dog("Name5",10));
        set1.add(new Dog("Name2",11));
        set1.add(new Dog("Name89",7));
        set1.add(new Dog("Name4",3));
        System.out.println(set1);


        System.out.println("-------TreeMap-------------");
        Map<Integer, String> map = new TreeMap<>();
        map.put(4,"Thursday");
        map.put(1,"Tuesday");
        map.put(2,"Tuesday");
        map.put(3,"Tuesday");
        //Set<Integer> keys=map.keySet();
        for(int key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("values:"+map.values());
        System.out.println(map);
        System.out.println("-------Dog TreeMap-------------");
        Map<Dog, String> map1 = new TreeMap<>();
        map1.put(new Dog("Name1",3),"Val1");
        map1.put(new Dog("Name1",1),"Val2");
        map1.put(new Dog("Name1",0),"Val3");
        map1.put(new Dog("Name1",2),"Val4");
        System.out.println(map1.size());
        System.out.println(map1);
        for(Dog key:map1.keySet()){
            System.out.println(key+"="+map1.get(key));
        }

    }

}
