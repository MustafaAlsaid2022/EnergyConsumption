package collections;

import java.util.Vector;


public class VectorCollection<T> extends MyCollections{

    public VectorCollection(){
        super.collection = new Vector<T>();
    }
    
}