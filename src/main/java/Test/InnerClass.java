package main.java.Test;

import org.junit.Test;

public class InnerClass {
    abstract static class AnonymousInner {
        public abstract void mymethod();
    }

    interface Message{
        String getMessage();
    }

    public static void main(String[] args) {
        AnonymousInner anonymousInner = new AnonymousInner(){
            @Override
            public void mymethod() {
                System.out.println("11111");
            }
        };
        anonymousInner.mymethod();
    }

    public void WriteSome(Message s ){
        System.out.println( s.getMessage()+" this is interfaceInner" );
    }

    @Test
    public void InterfaceInner(){
        WriteSome( new Message(){

            @Override
            public String getMessage() {
                return "hello";
            }
        } );
    }
}
