package main.java.AnnotationBasedConfiguration.RequiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
    public String name;

    public Integer age;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }
}
