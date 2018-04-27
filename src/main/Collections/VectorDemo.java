package main.Collections;

import sun.awt.SunHints;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector( 3, 2 );
        System.out.println( "Initial size: " + vector.size() );
        System.out.println( "Initial capacity: " + vector.capacity() );
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " + vector.capacity());
        System.out.println("Capacity after four size: " + vector.size());


        vector.addElement(new Double(5.45));
        vector.addElement(new Double(6.45));
        System.out.println("Current capacity: " + vector.capacity());

        vector.addElement(new Double(6.08));
        vector.addElement(new Integer(7));
        System.out.println("Current capacity: " + vector.capacity());

        vector.addElement(new Float(9.4));
        vector.addElement(new Integer(10));
        System.out.println("Current capacity: " + vector.capacity());
//
//        vector.addElement(new Integer(11));
//        vector.addElement(new Integer(12));
//        System.out.println("First element: " + (Integer)vector.firstElement());
//        System.out.println("Last element: " + (Integer)vector.lastElement());
    }
}
