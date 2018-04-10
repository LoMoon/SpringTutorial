package main.java.DependencyInjection.ConstructorBasedDependencyInjection;

public class TextEditor {
    private SpellChecker spellChecker;

    public  TextEditor( SpellChecker spellChecker ){
        System.out.println("this is TextEditor constructor");
        this.spellChecker = spellChecker;
    }

    public TextEditor( int x, String y ){
        System.out.println( x+y );
    }

    public void spellCheck(){
        spellChecker.CheckSpeling();
    }

}
