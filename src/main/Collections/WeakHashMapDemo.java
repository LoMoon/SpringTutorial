package main.Collections;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap wak = new WeakHashMap();
        wak.put(new String("数学"), new String("优良"));
        wak.put(new String("语文"), new String("良好"));

        wak.put( "java", new String("好" ) );

        System.out.println(wak);
        System.gc( );
        System.runFinalization( );
        System.out.println( wak );

        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put( new String( "k" ), new String("k1" ) );
        identityHashMap.put( new String( "k" ), new String("k2" ) );
        identityHashMap.put( "Z", new String("Z" ) );
        System.out.println( identityHashMap );

        System.out.println( identityHashMap.get( "Z" ) );
    }
    @Test
    public void test(){
        EnumMap enumMap = new EnumMap( Seaon.class );
        enumMap.put( Seaon.spring, "Spring" );
        enumMap.put( Seaon.summer, "Summer" );
        enumMap.put( Seaon.fail, "" );
        enumMap.put( Seaon.winner, "winner" );
//        enumMap.put( "1231","null" );
        System.out.println( enumMap );
    }

    enum Seaon{
        spring,summer,fail,winner
    }
}
