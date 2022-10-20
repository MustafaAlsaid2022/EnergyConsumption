//package collections;
//
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.Random;
//
//public class WriteToFile {
//
//    private final Random rand;
//
//    public WriteToFile() {
//        this.rand = new Random();
//    }
//
//    public void writeRandomNumbersToFile(String fileName, int seed) {
//        try ( PrintWriter pw = new PrintWriter(fileName)) {
//            for (int i = 0; i < seed; i++) {
//                pw.print(rand.nextInt() + " ");
//            }
//            pw.flush();
//            pw.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//}
