package collections;

import java.util.ArrayDeque;
import java.util.Random;


public class ArrayDequeCollection<T> extends MyCollections{

    public ArrayDequeCollection(){
        super.collection = new ArrayDeque<T>();
    }
    
     public void add(int seed, int number) {
        try {
            random = new Random(seed); 
            int i = 0;
            start = System.currentTimeMillis();
            while (i < number){
                int element = random.nextInt();
                collection.add(element);
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        end = System.currentTimeMillis();
    }
    
     public void remove(int seed, int number) {
        try {
            random = new Random(seed);
            int i = 0;
            start = System.currentTimeMillis();
            while (i < number){
                int element = random.nextInt();
                collection.remove(element);
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        end = System.currentTimeMillis();
    }

    public void contains(int seed, int number) {
        try {
            random = new Random(seed);
            int i = 0;
            start = System.currentTimeMillis();
            while (i < number){
                int element = random.nextInt();
                collection.contains(element);
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        end = System.currentTimeMillis();
    }
    
}