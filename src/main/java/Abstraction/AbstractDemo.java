package main.java.Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        Employee e = new Salary("hu", "hq", 25, 6000)  ;
        Salary s = new Salary( "chang", "hq", 25, 9000 );
        System.out.println( "employee mailcheck" );
        e.mailCheck();
        System.out.println( "salary mailcheck" );
        s.mailCheck();
    }
}
