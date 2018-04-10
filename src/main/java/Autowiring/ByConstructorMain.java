package main.java.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByConstructorMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring/beanByConstructor.xml");
        TextEditorByConstruc textEditorByConstruc = (TextEditorByConstruc) context.getBean("textEditor");
        textEditorByConstruc.CheckSpelling();
        textEditorByConstruc.getName();
    }
}
