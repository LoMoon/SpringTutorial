package main.java.DependencyInjection.ConstructorBasedDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection/ConstructorBasedDependencyInjection/beanOfConstructorInjection.xml");
        TextEditor obj = (TextEditor) context.getBean("textEditor");
//        obj.spellCheck();
    }
}
