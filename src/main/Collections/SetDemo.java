package main.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int count[] = {34, 22,10,60,30,22};
        Set< Integer > set = new HashSet<Integer>( );
        for( int i: count ){
            set.add( i );
        }
        System.out.println( set );
        TreeSet sortSet = new TreeSet( set );

        Iterator iterator = sortSet.iterator();
        while( iterator.hasNext() ){
            System.out.println( iterator.next() );
        }

        System.out.println( "First="+ sortSet.first() );
        System.out.println( "End="+ sortSet.last() );
    }

}
