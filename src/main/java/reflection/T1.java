package main.java.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        try {
            Class class1 = Class.forName("main.java.reflection.Person");
            System.out.println(class1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class class2 = Person.class;
        System.out.println(class2);

        Person person = new Person();
        Class class3 = person.getClass();
        System.out.println(class3);

    }
    @Test
    public void Test(){
        try {
           Class class1 = Class.forName("main.java.reflection.Person");
           Object object = class1.newInstance();
           Person person = (Person) object;
           person.getAge();
           person.getName();
           person.getId();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }

    @Test
    public void Test2(){
        try {
            Class  class1 = Class.forName("main.java.reflection.Person");
            Object person = class1.newInstance();
            Field age = class1.getDeclaredField("name");

            age.setAccessible( true );
            age.set( person, "11" );

//            Method[] methods = class1.getMethods();
//            for(Method metho: methods){
//                System.out.println(metho.getName());
//            }
//
//            Method method = class1.getMethod("setName", String.class)

            Method setName = class1.getDeclaredMethod("setName", String.class);
            setName.setAccessible( true );
            setName.invoke( person, "hu" );

            Method getName = class1.getDeclaredMethod("getName" );
            getName.invoke( person );
            System.out.println( age.get( person ) );
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void generisic(){
        List list1 = new ArrayList();
        List<String> list2 = new ArrayList<String>();

        list2.add("hello");
//        list2.add(2);

        Class c1 = list1.getClass();
        Class c2 = list2.getClass();

        System.out.println(c1==c2);

        try {
            Method m = c2.getMethod("add", Object.class);
            m.invoke(list2,1);
            System.out.println(list2.size());
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
