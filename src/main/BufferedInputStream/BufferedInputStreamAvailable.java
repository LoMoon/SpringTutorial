package main.BufferedInputStream;

import org.junit.Test;

import java.io.*;

public class BufferedInputStreamAvailable {


    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream bis = null;
        try {
            inputStream = new FileInputStream("D:/test.txt" );
            bis = new BufferedInputStream( inputStream );

            while( bis.available() >0 ){
                Integer integer = bis.available();
                System.out.println( "Available bytes = " + integer );

                char ch = (char)bis.read();
                System.out.println("The character read = " + ch );
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if( inputStream != null ){
                inputStream.close();
            }
            if( bis != null ){
                bis.close();
            }
        }

    }

    @Test
    public void test() throws Exception{
        InputStream inputStream = null;
        BufferedInputStream bis = null;
        try {
            inputStream = new FileInputStream( "D:/test.txt" );
            bis = new BufferedInputStream( inputStream );
            int coutBis = bis.available();
            System.out.println( coutBis );
            bis.close();
            coutBis = bis.available();
            System.out.println( coutBis );
        }catch ( IOException e ){
//            System.out.println(  );
//            e.printStackTrace();
        }finally {
            if(inputStream != null ){
                inputStream.close();
            }
        }
    }

    @Test
    public void test2() throws Exception {
        InputStream inputStream = null;
        BufferedInputStream bis = null;
        try {
            inputStream = new FileInputStream( "D:/test.txt" );
            bis = new BufferedInputStream( inputStream );
            System.out.println( "Char : "+(char)bis.read() );
            System.out.println( "Char : "+(char)bis.read() );
            System.out.println( "Char : "+(char)bis.read() );

            bis.mark( 0 );

            System.out.println( "Char : "+(char)bis.read() );

            bis.reset();
            System.out.println( "Char : "+(char)bis.read() );
            System.out.println( "Char : "+(char)bis.read() );

        }catch ( Exception e ){
            e.printStackTrace();
        }finally {
            if( inputStream != null ){
                inputStream.close();
            }
        }
    }
    @Test
    public void test3() throws Exception{
        InputStream inputStream = null;
        BufferedInputStream bis = null;
        try {
            inputStream = new FileInputStream( "D:/test.txt" );
            bis = new BufferedInputStream( inputStream );
            int num = bis.available();
            byte[] bytes = new byte[ num ];
            bis.read( bytes, 2,3  );
            for( byte by : bytes ){
                System.out.println( (char)by+": " + by );
            }

        }catch ( Exception e ){
            e.printStackTrace();
        }finally {
            if( inputStream != null ){
                inputStream.close();
            }
        }
    }
    @Test
    public void test4() throws Exception{
        InputStream inputStream = null;
        BufferedInputStream bis = null;
        try {
            inputStream = new FileInputStream("D:/test.txt" );
            bis = new BufferedInputStream( inputStream );

            while( bis.available() >0 ){
//                Integer integer = bis.available();
//                System.out.println( "Available bytes = " + integer );
                bis.skip( 2 );
                char ch = (char)bis.read();
                System.out.println("The character read = " + ch );
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if( inputStream != null ){
                inputStream.close();
            }
            if( bis != null ){
                bis.close();
            }
        }
    }
    @Test
    public void BufferedOutputStreamFlush() throws Exception{
        FileInputStream is = null;
        BufferedInputStream bi = null;
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bos = null;


        try {
            is = new FileInputStream( "D:/test.txt" );
            bi = new BufferedInputStream( is );
            baos = new ByteArrayOutputStream();
            bos = new BufferedOutputStream( baos );

            int value;

            while ( ( value = bi.read() ) != -1 ){
                bos.write( value );
            }
            bos.flush();

            for( byte b : baos.toByteArray() ){
                char c = (char) b;
                System.out.println(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void BufferedOutputStreamWrite() throws Exception{
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bos = null;

        try {

            // create new output streams.
            baos = new ByteArrayOutputStream();
            bos = new BufferedOutputStream(baos);

            // assign values to the byte array
            byte[] bytes = {1, 2, 3, 4, 5};

            // write byte array to the output stream
            bos.write(bytes, 0, 5);

            // flush the bytes to be written out to baos
            bos.flush();

            byte[] bytes1 = { 6, 7, 8, 9, 10};
            bos.write( bytes1, 0 ,5 );
            bos.flush();

            for (byte b:baos.toByteArray()) {

                // prints byte
                System.out.print(b);
            }
        } catch(IOException e) {

            // if any IOError occurs
            e.printStackTrace();
        } finally {

            // releases any system resources associated with the stream
            if(baos!=null)
                baos.close();
            if(bos!=null)
                bos.close();
        }
    }

}
