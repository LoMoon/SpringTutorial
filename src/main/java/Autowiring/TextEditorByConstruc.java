package main.java.Autowiring;

public class TextEditorByConstruc {
    private SpellChecker spellChecker;
    private String name;

    public TextEditorByConstruc( SpellChecker spellChecker, String name ){
        System.out.println("this is one con");
        this.name = name;
        this.spellChecker = spellChecker;
    }

    public TextEditorByConstruc( SpellChecker spellChecker ){
        System.out.println("this is two con");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void CheckSpelling(){
        spellChecker.checkSpelling();
    }
}
