package main.java.definitionInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDefinitionInheritance {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("tutorialspoint/definitionInheritance/bean.xml");
        DefinitionInheritance obja = (DefinitionInheritance)context.getBean("helloWorld");
        obja.getMessage1();
        obja.getMessage2();

        HelloIndia objb = (HelloIndia) context.getBean("helloIndia");
        objb.getMessage1();
        objb.getMessage2();
        objb.getMessage3();
    }
}
