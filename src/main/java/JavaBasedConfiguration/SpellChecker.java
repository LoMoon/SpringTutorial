package main.java.JavaBasedConfiguration;

public class SpellChecker {

    public String word;

    public SpellChecker(){
        System.out.println("spellchecker conctur");
    }

    public void init(){
        System.out.println( "this is SpellChecker's init method" );
    }


    public void checkSpelling(){
        System.out.println( "this is checkspeling" );
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
