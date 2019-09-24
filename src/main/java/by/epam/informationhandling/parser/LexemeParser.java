package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import by.epam.informationhandling.composite.Leaf;

public class LexemeParser implements Parser {//TODO division of lexemes on words and expressions
    @Override
    public Component parse(String lexeme) {
        Component lexemeComponent = new Composite();
        for (char symbol: lexeme.toCharArray()) {
            Component symbolComponent = new Leaf(String.valueOf(symbol));
            lexemeComponent.addComponent(symbolComponent);
        }
        return lexemeComponent;
    }
}
