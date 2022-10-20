package collections;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;


public class MyCollections<T> {

    protected Collection collection;
    protected Scanner scan;
    protected Random random;
    protected double start;
    protected double end;

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

    public Collection getCollection() {
        return collection;
    }

    public double estimatedTotalTime() {
        return end - start;
    }
    
    public void writeToFile(String fileName,MyCollections collection) {
               try (PrintWriter pw = new PrintWriter(new FileOutputStream(fileName, true))) {
                pw.println(collection.estimatedTotalTime());
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
