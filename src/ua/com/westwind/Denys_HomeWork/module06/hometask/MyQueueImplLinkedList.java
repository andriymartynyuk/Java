package ua.com.westwind.Denys_HomeWork.module06.hometask;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Администратор on 09.07.2016.
 */
public class MyQueueImplLinkedList implements MyQueue, Iterable{
    private LinkedList data;

    public MyQueueImplLinkedList() {
        data = new LinkedList();
    }

    @Override
    public Object peek() {
        return data.removeFirst();
    }

    @Override
    public Object poll() {
        return data.getFirst();
    }

    @Override
    public void offer(Object val) {
        data.addLast(val);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return data.iterator();
    }
}
