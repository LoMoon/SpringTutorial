package main.java.property;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IntrospectorDemo {

    public static void main(String[] args) throws Exception {
//        Person p = new Person( "css", 1);
//        p.setAge( 2 );
//        PropertyDescriptor prop = new PropertyDescriptor( "age", Person.class );
//        Object str = prop.getReadMethod().invoke( p );
//        System.out.println( str );
//        
//        prop.getWriteMethod().invoke( p, 3 );
//        System.out.println( str );
//        System.out.println( p.getAge() );
//        User user = new User();
//        Field[] fields = Person.class.getDeclaredFields();
//        for(Field field: fields){
//            PropertyDescriptor prop = new PropertyDescriptor( field.getName(), Person.class );
//            PropertyDescriptor propb = new PropertyDescriptor( field.getName(), User.class );
//            System.out.println( prop.getReadMethod().invoke( p ) );
//            propb.getWriteMethod().invoke( user, prop.getReadMethod().invoke( p ) );
//        }
//        System.out.println( user.getAge()+"  "+ user.getName() );

        Person p = new Person("huyue", 26);
        User user = new User();
        Field[] fields = Person.class.getDeclaredFields();
        for (Field field : fields) {
            PropertyDescriptor personPro = new PropertyDescriptor(field.getName(), Person.class);
            PropertyDescriptor userPro = new PropertyDescriptor(field.getName(), User.class);
            userPro.getWriteMethod().invoke(user, personPro.getReadMethod().invoke(p));
        }
        System.out.println(user.getAge() + "   " + user.getName());
    }

    private static void setProperty(Object obj, String propertyName, Object value) throws Exception {
        PropertyDescriptor pd = new PropertyDescriptor(propertyName, obj.getClass());
        Method setMethod = pd.getWriteMethod();
        setMethod.invoke(obj, value);
    }

    private static Object getProperty(Object obj, String propertyName) throws Exception {
        PropertyDescriptor pd = new PropertyDescriptor(propertyName, obj.getClass());
        Method getMethod = pd.getReadMethod();
        return getMethod.invoke(obj);
    }
}
