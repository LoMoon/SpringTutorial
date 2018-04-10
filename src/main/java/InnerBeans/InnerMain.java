package main.java.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBeans/bean.xml");
        TextEditor t = (TextEditor)context.getBean("textEditor");
        t.spellCheck();
    }
}
