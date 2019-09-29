package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import by.epam.informationhandling.composite.Symbol;

public class LexemeComponentParser implements ComponentParser {
    @Override
    public Component parse(String lexeme) {
        Component lexemeComponent = new Composite();
        for (char symbol: lexeme.toCharArray()) {
            Component symbolComponent = new Symbol(symbol);
            lexemeComponent.addComponent(symbolComponent);
        }
        return lexemeComponent;
    }
}