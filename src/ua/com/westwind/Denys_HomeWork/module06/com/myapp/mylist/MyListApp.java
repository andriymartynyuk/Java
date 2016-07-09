package ua.com.westwind.Denys_HomeWork.module06.com.myapp.mylist;

/**
 * Created by Администратор on 07.07.2016.
 */
public class MyListApp {

    public static void main(String[] args){
        MySimpleList simpleList = new MySimpleListImpl(5);
        simpleList.add("Name1");
        simpleList.add("Name2");
        simpleList.add("Name3");
        simpleList.add("Name1");
        System.out.println(simpleList.size());
        System.out.println(simpleList.isEmpty());
        simpleList.add("Name1");
        simpleList.add("Name1");
        simpleList.add("Name1");
        System.out.println(simpleList.size());
        System.out.println(simpleList.isEmpty());

        System.out.println(simpleList.get(3));
        Object oldValue=simpleList.set(3, "Test");
        System.out.println("oldValue="+oldValue);
        System.out.println(simpleList.get(3));
        System.out.println("-------------------");
        for(int i=0;i<simpleList.size();i++){
            System.out.println(simpleList.get(i));
        }
        for(Object obj:simpleList){
            System.out.println(obj);
        }

    }
}
