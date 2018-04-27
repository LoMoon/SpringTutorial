package main.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        // Add elements to the set
        set.add("1");
        set.add("4");
        set.add("2");

        // Iterating over the elements in the set
        Iterator it = set.iterator();

        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            System.out.println(element.toString());
        }
//        Comparator comparator = set.comparator();
//        System.out.println( comparator );

        TreeSet headset = (TreeSet) set.headSet( "5" );
        System.out.println(headset);
        TreeSet tailset = (TreeSet) set.tailSet( "1" );
        System.out.println(tailset);
        TreeSet subset = (TreeSet) set.subSet("1","2");
        System.out.println(subset);
    }
}
