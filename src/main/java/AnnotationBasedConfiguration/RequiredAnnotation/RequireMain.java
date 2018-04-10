package main.java.AnnotationBasedConfiguration.RequiredAnnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequireMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBasedConfiguration/RequireBean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("age="+ student.getAge());
        System.out.println("name="+ student.getName());

    }


}
