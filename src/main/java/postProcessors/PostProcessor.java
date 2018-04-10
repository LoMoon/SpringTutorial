package main.java.postProcessors;

public class PostProcessor {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
