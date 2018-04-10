package main.java.AnnotationBasedConfiguration.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    public String name;

    public Integer age;

    public String getName() {
        return name;
    }

    @Autowired( required=false )
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Autowired
    public void setAge(Integer age) {
        this.age = age;
    }
}
