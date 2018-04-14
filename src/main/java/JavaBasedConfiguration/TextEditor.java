package main.java.JavaBasedConfiguration;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("textEditor contrc");
        this.spellChecker = spellChecker;
    }

    public void checkSpell(){
        spellChecker.checkSpelling();
    }

    public void setWord( String word ){
        spellChecker.setWord( word );
    }

    public String getWord(){
        return spellChecker.getWord();
    }

    public void des(){
        System.out.println("this is TextEditor's detory method");
    }

}
