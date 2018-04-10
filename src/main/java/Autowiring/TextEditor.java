package main.java.Autowiring;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    public void setSpellChecker( SpellChecker spellChecker ){
        System.out.println( "TextEditor Setter" );
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName( String name ){
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void spellChecker(){
        spellChecker.checkSpelling();
    }
}
