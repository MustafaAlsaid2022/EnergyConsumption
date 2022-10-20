package collections;

import java.util.Stack;


public class StackCollection<T> extends MyCollections{

    public StackCollection(){
        super.collection = new Stack<T>();
    }
    
}