package main.java.AnnotationBasedConfiguration.AutowiredAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZooMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "AnnotationBasedConfiguration/bean.xml" );
        Zoo zoo = (Zoo) context.getBean( "zoo" );
        System.out.println( zoo.toString() );
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext( "AnnotationBasedConfiguration/bean.xml" );
        CarFactory carFactory = (CarFactory) context.getBean("carFactory");
        System.out.println( carFactory.toCar() );
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext( "AnnotationBasedConfiguration/Servicebean.xml" );
        Zoo zoo = (Zoo) context.getBean("zoo");
        System.out.println( zoo.toString() );
    }

}
