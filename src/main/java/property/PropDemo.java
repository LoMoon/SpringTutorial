package main.java.property;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties cap = new Properties();
        Set stats;
        String str;
        cap.put("Illinois", "Springfield");
        cap.put("Missouri", "Jefferson City");
        cap.put("Washington", "Olympia");
        cap.put("California", "Sacramento");
        cap.put("Indiana", "Indianapolis");
        stats = cap.keySet();
        Iterator itr = stats.iterator();
        while ( itr.hasNext() ){
            str = (String) itr.next();
            System.out.println( str+"gggg"+cap.getProperty( str ) );
        }
        System.out.println();
        str = cap.getProperty( "tianjian","beijing" );
        System.out.println( str );
    }
}
