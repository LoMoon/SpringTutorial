package main.java.AnnotationBasedConfiguration.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBasedConfiguration/AutowiredBean.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.CheckSpelling();

        Student student = (Student) context.getBean("student");
        System.out.println("age="+ student.getAge());
        System.out.println("name="+ student.getName());

    }
}
