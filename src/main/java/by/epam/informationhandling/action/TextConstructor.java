package by.epam.informationhandling.action;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Symbol;

import java.util.List;

public class TextConstructor {
    public String restore(Component textComponent) {
        StringBuilder text = new StringBuilder();
        List<Component> paragraphs = textComponent.getComponents();
        paragraphs.forEach(paragraph -> {
            text.append("\t");
            List<Component> sentences = paragraph.getComponents();
            sentences.forEach(sentence -> {
                List<Component> lexemes = sentence.getComponents();
                lexemes.forEach(lexeme -> {
                    List<Component> symbols = lexeme.getComponents();
                    symbols.forEach(symbol -> {
                        Symbol symbolLeaf = (Symbol) symbol;
                        text.append(symbolLeaf.getValue());
                    });
                    text.append(" ");
                });
            });
            text.append("\n");
        });
        return text.toString();
    }
}
