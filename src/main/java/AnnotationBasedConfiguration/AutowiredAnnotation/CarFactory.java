package main.java.AnnotationBasedConfiguration.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarFactory {
    @Autowired
    @Qualifier("bmwCar")
    private ICar iCar;

    public String toCar(){
        return iCar.getCarName();
    }
}
