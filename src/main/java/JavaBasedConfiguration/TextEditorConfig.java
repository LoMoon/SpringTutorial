package main.java.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TextEditorConfig {
    @Bean
    @Scope(value = "singleton")
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    @Scope(value = "prototype")
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
