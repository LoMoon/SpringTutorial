package main.java.JavaBasedConfiguration;

import main.java.chartpater1.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaMain {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext( HelloWorldConfig.class );
//
//        HelloWorld helloWorld = ctx.getBean( HelloWorld.class );
//
//        helloWorld.setMessage( "helloWorld" );
//        helloWorld.getMessage();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register( HelloWorld.class );
        ctx.refresh();

        HelloWorld helloWorld = ctx.getBean( HelloWorld.class );
        helloWorld.setMessage( ": i want meet you" );
        helloWorld.getMessage();

    }

    @Test
    public void Test(){
        ApplicationContext context = new AnnotationConfigApplicationContext( TextEditorConfig.class );
        TextEditor te = context.getBean( TextEditor.class );
        te.checkSpell();
        te.setWord("huhu");
        System.out.println( "第一次说你的名字："+ te.getWord() );

        TextEditor textEditor = context.getBean( TextEditor.class );
        System.out.println( "第二次说你的名字: "+ textEditor.getWord()  );

    }

    @Test
    public void Test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("main.java.JavaBasedConfiguration");
        ctx.refresh();
        TextEditor textEditor = ctx.getBean( TextEditor.class );
        textEditor.checkSpell();

    }

}
