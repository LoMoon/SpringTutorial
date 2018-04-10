package main.java.AnnotationBasedConfiguration.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    public SpellChecker spellChecker;


    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    @Autowired
    public TextEditor( SpellChecker spellChecker ){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }


    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void CheckSpelling(){
        spellChecker.checkSpelling();
    }
}
