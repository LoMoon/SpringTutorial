package main.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        List list1 = new ArrayList(  );
        list1.add( "zara1" );
        list1.add( "aara1" );
        list1.add( "bara1" );
        list1.add( "cara1" );
        Iterator iterator = list1.iterator();
//        while( iterator.hasNext() ){
//            System.out.println( iterator.next() );
//        }
//        list1.remove( "zara1" );
//        System.out.println( list1.indexOf( "aara" ) );
//        System.out.println( list1.lastIndexOf( "aara1" ) );
//        System.out.println(list1);
        list1.add( 2, "yue" );
        list1.set( 2, "hu" );

        List list2 = list1.subList( 1 , 4 );
        ListIterator listIterator = list2.listIterator( );
        while( listIterator.hasNext() ){
            System.out.println( listIterator.next() );
        }

//        Object[] s =  list1.toArray();
//        for( Object o : s ){
//            System.out.println( o.toString() );
//        }
    }
}
