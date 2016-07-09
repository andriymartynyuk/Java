package ua.com.westwind.Denys_HomeWork.module06.com.company;


import java.util.*;

/*                  Collection                                                                                      Map
                        List                                    Set                                        HashMap TreeMap LinkedHashMap Hashtable
               ArrayList    LinkedList  Vector          HashSet TreeSet LinkedHashSet


        1.List:
            - index access
            - order
            - no unique elements

        2.Set
            - no index access
            - no order
            - unique

        */
public class Main {

    public static void main(String[] args){
        //listExample();
        setExample();

    }

    public static void setExample(){
        Set set = new HashSet<>();
        set.add("Denis");
        set.add("Boris");
        set.add("Piter1");
        set.add("Piter2");
        set.add("Piter3");
        set.add("Piter4");

        set.add("Denis");
        set.add("Boris");
        set.add("Piter1");
        set.add("Piter2");
        set.add("Piter3");
        set.add("Piter4");

        System.out.println("---------------------");
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------------------");
        for(Object item:set){
            System.out.println(item);
        }
    }



    public static void listExample() {
        List list = new ArrayList();
        //list.add("Jack");
        list.add("Denis");
        list.add("Boris");
        list.add("Piter");
        list.add("Denis");
        list.add("Boris");
        list.add("Piter");
        list.add(0, "Jack");
        Object oldVlaue=list.set(1, "Piter");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("Denis");
        linkedList.add(0, "Denis");

        linkedList.addLast("Boris");
        linkedList.add(linkedList.size()-1, "Boris");
        linkedList.add("Boris");

        ArrayList arrayList = new ArrayList();

        Vector vector = new Vector();


    }
}
