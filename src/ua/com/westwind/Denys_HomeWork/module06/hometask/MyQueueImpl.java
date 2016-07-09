package ua.com.westwind.Denys_HomeWork.module06.hometask;

import java.util.Iterator;

/**
 * Created by Администратор on 09.07.2016.
 */
public class MyQueueImpl implements MyQueue, Iterable{
    private Object[] data;
    private int capacity;
    private int currentSize;

    public MyQueueImpl() {
        this(10);
    }

    public MyQueueImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public Object peek() {
        Object oldValue=data[0];
        for(int i=0;i<currentSize-1;i++){
            data[i]=data[i+1];
        }
        data[currentSize-1]=null;
        return oldValue;
    }

    @Override
    public Object poll() {
        return data[0];
    }

    @Override
    public void offer(Object val) {
        if(currentSize+1>data.length){
            Object[] enrichedData = new Object[capacity+10];
            System.arraycopy(data,0,enrichedData,0,data.length);
            data=enrichedData;
        }
        data[currentSize++]=val;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Object next() {
                return data[0];
            }
        };
    }
}
