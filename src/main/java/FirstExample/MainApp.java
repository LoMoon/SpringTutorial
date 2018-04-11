package main.java.FirstExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("FirstExample/bean.xml");
        FirstExa obj = (FirstExa) context.getBean("helloWorld");
        obj.getMessage();
    }
}
