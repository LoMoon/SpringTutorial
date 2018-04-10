package main.java.chartpater1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("tutorialspoint/chartpter1/bean.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\LoMon\\Workspaces\\MyEclipse Professional 2014\\aaaa\\resources\\tutorialspoint\\chartpter1\\bean.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("tutorialspoint/chartpter1/bean.xml"));
//        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("this is singleton");
        obj.getMessage();

        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();

        context.registerShutdownHook();
     }
}
