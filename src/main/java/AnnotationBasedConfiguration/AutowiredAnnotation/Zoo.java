package main.java.AnnotationBasedConfiguration.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class Zoo {
    @Autowired
    public Monkey monkey;
    @Autowired
    public Tiger tiger;
    public String toString(){
        return monkey+"\n"+tiger;
    }
}
