package collections;

import java.util.LinkedList;
import java.util.Random;


public class LinkedListCollection<T> extends MyCollections{

    public LinkedListCollection(){
        super.collection = new LinkedList<T>();
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
