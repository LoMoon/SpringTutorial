package main.Collections;

import java.util.Dictionary;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);

        st.insertElementAt( 33, 1 );
        st.setElementAt( 34, 1 );
        System.out.println( st.search( 100 ) );

        Enumeration<Integer> enumeration =  st.elements();
        while( enumeration.hasMoreElements() ){
            System.out.println( enumeration.nextElement() );
        }


//
//        showpop(st);
//        showpop(st);
//        showpop(st);
//        try {
//            showpop(st);
//        } catch (EmptyStackException e) {
//            System.out.println("empty stack");
//        }
    }
    public static void showpush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
    public static void showpop( Stack st){
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
}
