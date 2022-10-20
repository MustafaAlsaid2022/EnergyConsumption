package collections;

import java.util.ArrayDeque;


public class ArrayDequeCollection<T> extends MyCollections{

    public ArrayDequeCollection(){
        super.collection = new ArrayDeque<T>();
    }
    
}