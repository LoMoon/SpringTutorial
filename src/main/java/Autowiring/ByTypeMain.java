package main.java.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring/beanByType.xml");
        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.spellChecker();
    }
}
