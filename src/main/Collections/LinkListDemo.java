package main.Collections;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");
        System.out.println("Original contents of ll: " + linkedList);
//        linkedList.remove("F" );
        linkedList.remove();
        linkedList.remove( "F" );
        linkedList.remove( 3 );
        System.out.println(linkedList);


        Object val = linkedList.get( 2 );
        linkedList.set( 2, (String)val+"Changed" );
        System.out.println(linkedList);
        System.out.println( linkedList.size() );
        System.out.println( linkedList.indexOf( "A2" ) );
        linkedList.add( 2, "A2" );
        System.out.println( linkedList.lastIndexOf( "A2" ) );
        System.out.println( linkedList.contains( "A2" ) );
    }
}
