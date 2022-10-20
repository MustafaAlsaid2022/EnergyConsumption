package collections;

import java.util.LinkedHashSet;


public class LinkedHashSetCollection<T> extends MyCollections{

    public LinkedHashSetCollection(){
        super.collection = new LinkedHashSet<T>();
    }
    
}