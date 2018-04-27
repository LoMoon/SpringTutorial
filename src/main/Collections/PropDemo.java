package main.Collections;

import java.io.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capti = new Properties();
        Set set;
        String str;
        capti.put("Illinois", "Springfield");
        capti.put("Missouri", "Jefferson City");
        capti.put("Washington", "Olympia");
        capti.put("California", "Sacramento");
        capti.put("Indiana", "Indianapolis");
        set = capti.keySet();
        Iterator iterator = set.iterator();
//        while( iterator.hasNext() ){
//            str = (String) iterator.next();
//            System.out.println( "propername=" + capti.getProperty( str ) );
//        }

        Enumeration enumeration = capti.propertyNames();
        while ( enumeration.hasMoreElements() ){
            str = (String) enumeration.nextElement();
            System.out.println( "propername=" + capti.getProperty( str ) );
        }
        OutputStream out = null;
        File f= new File("d:" + File.separator + "test.txt") ;  // 声明File对象
        try {
            out = new FileOutputStream(f)  ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintStream bos = new PrintStream(out);
        System.out.println( capti.getProperty( "1","hu" ) );
        capti.list(bos);
//        out.write( bos );
//        System.out.println( bos.toString() );

    }
}
