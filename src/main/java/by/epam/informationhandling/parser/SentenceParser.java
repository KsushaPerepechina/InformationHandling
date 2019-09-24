package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;

import java.util.Arrays;

public class SentenceParser implements Parser {
    private static final Parser LEXEME_PARSER = new LexemeParser();

    @Override
    public Component parse(String sentence) {
        Component sentenceComponent = new Composite();
        Arrays.stream(sentence.split(" ")).forEach(lexeme -> {
            Component lexemeComponent = LEXEME_PARSER.parse(lexeme);
            sentenceComponent.addComponent(lexemeComponent);
        });
        return sentenceComponent;
    }
}
