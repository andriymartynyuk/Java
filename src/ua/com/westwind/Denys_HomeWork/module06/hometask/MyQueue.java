package ua.com.westwind.Denys_HomeWork.module06.hometask;

/**
 * Created by Администратор on 07.07.2016.
 */
public interface MyQueue {

    //same as get for MySimpleList
    public Object peek();

    //same as get for MySimpleList
    public Object poll();

    //same as add for MySimpleList
    public void offer(Object val);

    public int size();

    public boolean isEmpty();



    // [][][][][][][][][][]
    //offer("Denis");
    // ["Denis"][][][][][][][][][]   10[]  size=1=currentSize
    //offer("Boris");
    // ["Denis"]["Boris"][][][][][][][][]   10[]  size=2=currentSize
    //offer("Piter");
    // ["Denis"]["Boris"]["Piter"][][][][][][][]   10[]  size=3=currentSize

    //poll() --> "Denis"
    //["Denis"]["Boris"]["Piter"][][][][][][][]   10[]  size=3=currentSize
    //pok() --> "Denis"
    //["Denis"]["Boris"]["Piter"][][][][][][][]   10[]  size=3=currentSize
    //pok() --> "Denis"
    //["Denis"]["Boris"]["Piter"][][][][][][][]   10[]  size=3=currentSize

    //peek() --> "Denis"
    //["Boris"]["Piter"][][][][][][][][]   10[]  size=2=currentSize
    //peek() --> "Boris"
    //["Piter"][][][][][][][][][][]     10[]  size=1=currentSize
    //peek() --> "Piter"
    //[][][][][][][][][][]   10[]  size=0=currentSize






}
