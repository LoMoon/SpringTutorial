package main.java.DependencyInjection.SetterBasedDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection/ConstructorBasedDependencyInjection/beanOfSetter.xml");
        TextEditor obj = (TextEditor) context.getBean("textEditor");
        obj.spellCheck();
    }
}
