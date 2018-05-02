package main.java.studylang.booLean;

public class booleanEqual {
    public static void main(String[] args) {
        Boolean b1,b2;
        boolean res;
        b1 = new Boolean( true );
        b2 = new Boolean( false );
        res = b1.equals( b2 );
        String str = "b1="+b1+"b2="+b2+"Compare res="+res;
        System.out.println( str );
    }
}
