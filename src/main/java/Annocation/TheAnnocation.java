package main.java.Annocation;

import java.lang.annotation.Repeatable;
@Person( role = "git" )
@Person( role = "search" )
@Person( role = "humman" )
public class TheAnnocation {

}
@interface Persons{
    Person[] value();
}
@Repeatable( Persons.class )
@interface  Person{
    String[] role() default "";
}