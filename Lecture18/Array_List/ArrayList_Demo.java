package Lecture18.Array_List;

import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println();
        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3, -9); // (index, element)
        System.out.println(list); // range -> 0 to size

        // Get
        System.err.println(list.get(2));  // range -> 0 to size - 1

        // Remove
        System.err.println(list.remove(2));
        System.err.println(list);

        list.add(201);
        list.add(3);
        list.add(12);

        // Update
        System.err.println(list);
        list.set(3,20);
        System.err.println(list);

        // Size
        System.out.println(list.size());

        // Sort
        Collections.sort(list);
        System.err.println(list);

        
        ArrayList<String> ll = new ArrayList<>();
        ll.add("Saksham");
        ll.add("Tanisha");
        ll.add("Samaksh");
        ll.add("Rajdeep");
        System.err.println();

        // Display
        for (int i =0; i< ll.size(); i++){
            System.err.print(ll.get(i) + "   ");
        }

        System.err.println();

        for (int i =0; i< list.size(); i++){
            System.err.print(list.get(i) + "   ");
        }

        System.err.println();

        for ( int x : list){
            System.out.print(x+"    ");
        }
    }
}
