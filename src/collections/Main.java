package collections;


public class Main {

    public static void main(String[] args){
        String fileName1 = "arrayDeque.csv";
        String fileName2 = "priorityQueue.csv";
        String fileName3 = "hashSet.csv";
        String fileName4 = "linkedHashSet.csv";
        String fileName5 = "treeSet.csv";
        String fileName6 = "arrayList.csv";
        String fileName7 = "linkedList.csv";
        String fileName8 = "vector.csv";
        String fileName9 = "stack.csv";
        
        int number = 100000;
        int seed = 200;
        
        //Arraylist collection Add
        ArrayListCollection arrayList = new ArrayListCollection();
        LinkedListCollection linkedList = new LinkedListCollection();
        VectorCollection vector = new VectorCollection();
        StackCollection stack = new StackCollection();
        ArrayDequeCollection arrayDeque = new ArrayDequeCollection();
        PriorityQueueCollection priorityQueue = new PriorityQueueCollection();
        HashSetCollection hashSet = new HashSetCollection();
        LinkedHashSetCollection linkedHashSet = new LinkedHashSetCollection();
        TreeSetCollection treeSet = new TreeSetCollection();
        
       //ArrayList collection Add
        System.out.print("Add " + number + " elemrnt(S) to ArrayList .... ");
        arrayList.add(seed,number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + arrayList.estimatedTotalTime() + "\n");
        arrayList.writeToFile(fileName6, arrayList);

        
        //LinkedList collection Add
        System.out.print("Add " + number + " elemrnt(S) to LinkedList .... ");
        linkedList.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + linkedList.estimatedTotalTime() + "\n");
        linkedList.writeToFile(fileName7, linkedList);
        
        //Vector collection Add
        System.out.print("Add " + number + " elemrnt(S) to Vector .... ");
        vector.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + vector.estimatedTotalTime() + "\n");
        vector.writeToFile(fileName8, vector);

        //Stack collection Add
        System.out.print("Add " + number + " elemrnt(S) to Stack .... ");
        stack.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + stack.estimatedTotalTime() + "\n");
        stack.writeToFile(fileName9, stack);
        
        //ArrayDeque collection Add
        System.out.print("Add " + number + " elemrnt(S) to ArrayDeque .... ");
        arrayDeque.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + arrayDeque.estimatedTotalTime() + "\n");
        arrayDeque.writeToFile(fileName1, arrayDeque);
               
        //PriorityQueue collection Add
        System.out.print("Add " + number + " elemrnt(S) to PriorityQueue .... ");
        priorityQueue.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + priorityQueue.estimatedTotalTime() + "\n");
        priorityQueue.writeToFile(fileName2, priorityQueue);
        
        //HashSet collection Add
        System.out.print("Add " + number + " elemrnt(S) to HashSet .... ");
        hashSet.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + hashSet.estimatedTotalTime() + "\n");
        hashSet.writeToFile(fileName3, hashSet);
        
        //LinkedHashSet collection Add
        System.out.print("Add " + number + " elemrnt(S) to LinkedHashSet .... ");
        linkedHashSet.add(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + linkedHashSet.estimatedTotalTime() + "\n");
        linkedHashSet.writeToFile(fileName4, linkedHashSet);

        //TreeSet collection Add
         System.out.print("Add " + number + " elemrnt(S) to TreeSet .... ");
         treeSet.add(seed, number);
         System.out.print(" Done .... ");
         System.out.println("The estimated Time: " + treeSet.estimatedTotalTime() + "\n");
         treeSet.writeToFile(fileName5, treeSet);
         
         
         
          //ArrayList collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in ArrayList .... ");
        arrayList.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + arrayList.estimatedTotalTime() + "\n");
        arrayList.writeToFile(fileName6, arrayList);
        
          //LinkedList collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in LinkedList .... ");
        linkedList.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + linkedList.estimatedTotalTime() + "\n");
        linkedList.writeToFile(fileName7, linkedList);
        
         //Vector collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in Vector .... ");
        vector.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + vector.estimatedTotalTime() + "\n");
        vector.writeToFile(fileName8, vector);
        
         //Stack collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in Stack .... ");
        stack.contains(seed,number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + stack.estimatedTotalTime() + "\n");
        stack.writeToFile(fileName9, stack);
        
         //ArrayDeque collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in ArrayDeque .... ");
        arrayDeque.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + arrayDeque.estimatedTotalTime() + "\n");
        arrayDeque.writeToFile(fileName1, arrayDeque);
        
         //Priority/queue collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in PriorityQueue .... ");
        priorityQueue.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + priorityQueue.estimatedTotalTime() + "\n");
        priorityQueue.writeToFile(fileName2, priorityQueue);
        
         //HashSet collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in HashSet .... ");
        hashSet.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + hashSet.estimatedTotalTime() + "\n");
        hashSet.writeToFile(fileName3, hashSet);
     
         //LinkedHashSet collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in LinkedHashSet .... ");
        linkedHashSet.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + linkedHashSet.estimatedTotalTime() + "\n");
        linkedHashSet.writeToFile(fileName4, linkedHashSet);
        
         //TreeSet collection Contains
        System.out.print("Check contains " + number + " elemrnt(S) in TreeSet .... ");
        treeSet.contains(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + treeSet.estimatedTotalTime() + "\n");
        treeSet.writeToFile(fileName5, treeSet);
         
         
         //ArrayList collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from ArrayList .... ");
        arrayList.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + arrayList.estimatedTotalTime() + "\n");
        arrayList.writeToFile(fileName6, arrayList);
        
          //LinkedList collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from LinkedList .... ");
        linkedList.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + linkedList.estimatedTotalTime() + "\n");
        linkedList.writeToFile(fileName7, linkedList);
        
         //Vector collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from Vector .... ");
        vector.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + vector.estimatedTotalTime() + "\n");
        vector.writeToFile(fileName8, vector);
        
        
         //Stack collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from Stack .... ");
        stack.remove(seed,number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + stack.estimatedTotalTime() + "\n");
        stack.writeToFile(fileName9, stack);
        
         //ArrayDeque collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from ArrayDeque .... ");
        arrayDeque.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + arrayDeque.estimatedTotalTime() + "\n");
        arrayDeque.writeToFile(fileName1, arrayDeque);
        
         //Priority/queue collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from PriorityQueue .... ");
        priorityQueue.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + priorityQueue.estimatedTotalTime() + "\n");
        priorityQueue.writeToFile(fileName2, priorityQueue);
        
         //HashSet collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from HashSet .... ");
        hashSet.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + hashSet.estimatedTotalTime() + "\n");
        hashSet.writeToFile(fileName3, hashSet);
       
     
         //LinkedHashSet collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from LinkedHashSet .... ");
        linkedHashSet.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + linkedHashSet.estimatedTotalTime() + "\n");
        linkedHashSet.writeToFile(fileName4, linkedHashSet);
        
         //TreeSet collection Remove
        System.out.print("Remove " + number + " elemrnt(S) from TreeSet .... ");
        treeSet.remove(seed, number);
        System.out.print(" Done .... ");
        System.out.println("The estimated Time: " + treeSet.estimatedTotalTime() + "\n");
        treeSet.writeToFile(fileName5, treeSet);
         
        
//        System.out.println(arrayList.getCollection());
//        System.out.println(linkedList.getCollection());
        
        
    }
}
