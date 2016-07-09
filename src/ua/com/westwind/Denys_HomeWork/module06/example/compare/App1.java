package ua.com.westwind.Denys_HomeWork.module06.example.compare;

import java.util.*;

/**
 * Created by Администратор on 07.07.2016.
 */
public class App1 {

    public static void main(String[] args){
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(-1);
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        System.out.println("-----------------------");
        List<Car> cars = new ArrayList();
        cars.add(new Car("Black",1000, 1));
        cars.add(new Car("White",3000, 3));
        cars.add(new Car("Red",2000, 2));

        System.out.println(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
              //  return  o1.getAge()-o2.getAge();
                Comparable c1 =(Comparable) o1;
                return  c1.compareTo(o2);
                    //return o1.compareTo(o2);
            }
        });
        System.out.println(cars);

        System.out.println("-----------------------");
        Set<Car> set = new TreeSet();
       /* Set<Car> set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        });*/
        set.add(new Car("Black",1000, 1));
        set.add(new Car("White",3000, 3));
        set.add(new Car("Red",2000, 2));
        System.out.println(set);


    }
}
