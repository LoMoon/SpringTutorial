package main.Collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        // Put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));
        // Get a set of the entries
        Set set = tm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println( tm.firstKey() );
        System.out.println( tm.lastKey() );
        System.out.println( tm.subMap( "Ayan","Mahnaz" ) );
        System.out.println( tm.tailMap("Mahnaz" ) );
    }
}
