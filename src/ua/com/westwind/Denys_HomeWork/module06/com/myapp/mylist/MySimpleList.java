package ua.com.westwind.Denys_HomeWork.module06.com.myapp.mylist;

import java.util.Iterator;

/**
 * Created by Администратор on 07.07.2016.
 */
public interface MySimpleList extends Iterable  {

    void add(Object obj);

    public Object set(int index, Object obj);

    public Object get(int index);

    public int size();

    Object remove(int index);

    public boolean isEmpty();

}
