package main.java.definitionInheritance;

public class DefinitionInheritance {
    private String message1;
    private String message2;

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.println("World Message1 : " + message1);
    }

    public void setMessage2(String message2) {
        System.out.println("World Message2 : " + message2);
    }
}
