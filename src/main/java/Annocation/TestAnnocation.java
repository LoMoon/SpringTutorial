package main.java.Annocation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnnocation {
    @SuppressWarnings( "deprecation")
    public static void main(String[] args) {
        ThisIsInterface thisIsInterface = new ThisIsInterface();
        thisIsInterface.speak();
        thisIsInterface.say();
        List<String> StringstringList = new ArrayList<String>(){
            {
                add("changss");
                add("huyue");
            }
        };
        cs( "changss","huyue","lomoon" );
        cs();

    }
    @SafeVarargs
    @Test
    public static void test(List<String>... stringLists){
        Object[] arry = stringLists;
        List<Integer> tempList = Arrays.asList(42);
        arry[0] = tempList;
        String list = stringLists[0].get( 0 );
    }

    public static void cs(String... strs){
        if( strs.length > 0 ){
            for( int i =0;i< strs.length;i++ ){
                System.out.println( "this is " + (i+1) + " 数据 " + strs[i] );
            }
        }else{
            System.out.println( "this is no data" );
        }

    }

  @Test
  public void testAnnotation(){
        boolean testAnno = TheAnnocation.class.isAnnotationPresent( main.java.Annocation.Person.class );
        if( testAnno ){
            Person person = TheAnnocation.class.getAnnotation( main.java.Annocation.Person.class );
            String[] role =  person.role();
            for( String s : role ){
                System.out.println( s );
            }
        }
  }
}
