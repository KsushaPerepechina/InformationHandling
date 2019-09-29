package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;

import java.util.Arrays;

public class SentenceComponentParser implements ComponentParser {
    private static ComponentParser nextComponentParser = new LexemeComponentParser();

    @Override
    public Component parse(String sentence) {
        Component sentenceComponent = new Composite();
        Arrays.stream(sentence.split(" ")).forEach(lexeme -> {
            Component lexemeComponent = nextComponentParser.parse(lexeme);
            sentenceComponent.addComponent(lexemeComponent);
        });
        return sentenceComponent;
    }
}
