package main.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        Set set = m1.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
//            System.out.println(me.getKey());
//            System.out.println(me.getValue());
//            System.out.println( me.hashCode() );
//            System.out.println( me.equals(m1) );
        }


    }
}
