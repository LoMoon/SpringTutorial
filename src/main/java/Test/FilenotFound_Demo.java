package main.java.Test;

import org.junit.Test;
import org.springframework.remoting.RemoteAccessException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

public class FilenotFound_Demo {
    public static void main(String[] args) throws Exception {
        File file = new File( "D:/text.txt" );
        try {
            FileReader fileReader = new FileReader( file );

            int num[] = {1,2,3,4,5};
            System.out.println( num[6] );
        } catch (FileNotFoundException|ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("this is exception!");


    }
    @Test
    public void test() throws RemoteException {
        if(false){

        }else{
            throw new RemoteException();
        }
    }

    @Test
    public void Try_withDemo()  {
        try( FileReader fr = new FileReader( "D:/text.txt" ) ) {
            char[] c = new char[50];
            fr.read(c);
            for(char a: c)
                System.out.println(a);
        }catch (IOException e){
            System.out.println("IO异常"+e);
        }

//        try( FileReader br = new FileReader( "D:/text.txt" ) ){
//
//        }catch ( IOException e ){
//            e.printStackTrace();
//        }
    }
    @Test
    public void inner_test(){
        Outer_Demo out = new Outer_Demo();
//        out.display_inner();
        Outer_Demo.Inner_demo inner = out.new Inner_demo();
        System.out.println(inner.getNum());
    }

}
