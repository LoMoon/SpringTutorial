package main.java.chartpater1;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message"+ message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("bean is going through it");
    }

    public void destory(){
        System.out.println("bean will destory now");
    }
}
