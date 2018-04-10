package main.java.InjectingCollection;

import main.java.Test.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("InjectingCollection/injectCollection.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        Address address =(Address) jc.getAddressList().get(0);
        address.getAddress();
        address.getMobile();
        Address address2 =(Address) jc.getAddressList().get(1);
        address2.getAddress();
        address2.getMobile();
    }
}
