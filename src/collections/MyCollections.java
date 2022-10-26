package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;


public class MyCollections<T> {

    protected Collection collection;
    protected Random random;
    protected double start;
    protected double end;

  

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
