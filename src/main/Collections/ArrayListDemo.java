package main.Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println( "Initial size of al: "+ arrayList.size() );
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");
        System.out.println("Size of al after additions: " + arrayList.size());


        // display the array list
        System.out.println("Contents of al: " + arrayList);
    }
}
