package main.java.studylang.booLean;

public class booleanGetBoolean {
    public static void main(String[] args) {
        Boolean b1,b2;
        System.setProperty( "demo1", String.valueOf(true));
        System.setProperty( "demo2", "abcd" );
        String s1 = System.getProperty( "demo1" );
        String s2 = System.getProperty( "demo2" );
        b1 = Boolean.getBoolean( "demo1" );
        b2 = Boolean.getBoolean( "demo2" );
    }
}
