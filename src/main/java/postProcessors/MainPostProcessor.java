package main.java.postProcessors;

import main.java.chartpater1.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPostProcessor {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("tutorialspoint/postProcessors/bean.xml");

        PostProcessor obj = (PostProcessor) context.getBean("postProcessor");
        obj.getMessage();

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();

        context.registerShutdownHook();
     }
}
