package main.java.Test;

public class Outer_Demo {
    int num = 175;
    public class Inner_demo{
        public void print(){
            System.out.println("this is inner");
        }
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
    void display_inner(){
        Inner_demo inner = new Inner_demo();
        inner.print();
    }


    void my_method(){
        final int num = 23;
        class method_inner{
            public void print(){
                System.out.println(num);
            }
        }
        method_inner inner = new method_inner();
        inner.print();
    }

    public static void main(String[] args) {
        Outer_Demo out = new Outer_Demo();
        out.my_method();
    }
}
