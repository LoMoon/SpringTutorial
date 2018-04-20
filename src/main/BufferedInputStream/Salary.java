package main.BufferedInputStream;

public class Salary extends Employee {
    private double salary;

    @Override
    public double computePay() {
        setName("2");
        setNum(1);
        System.out.println( "this is employee name"+getName() );
        return getNum();
    }

    public static void main(String[] args) {
        Salary salary = new Salary();
        System.out.println( salary.computePay() );
    }
}
