package main.java.DependencyInjection.SetterBasedDependencyInjection;

public class TextEditor {
    private SpellChecker spellChecker;


    public void spellCheck(){
        spellChecker.CheckSpeling();
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
}
