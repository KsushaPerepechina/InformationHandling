package by.epam.informationhandling.action;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Symbol;

import java.util.List;

public class TextConstructor {
    private static final String TAB_CHARACTER = "\t";
    private static final String LINE_FEED_CHARACTER = "\n";
    private static final String SPACE_CHARACTER = " ";

    public String restore(Component textComponent) {
        StringBuilder text = new StringBuilder();
        List<Component> paragraphs = textComponent.getComponents();
        paragraphs.forEach(paragraph -> {
            text.append(TAB_CHARACTER);
            List<Component> sentences = paragraph.getComponents();
            sentences.forEach(sentence -> {
                List<Component> lexemes = sentence.getComponents();
                lexemes.forEach(lexeme -> {
                    List<Component> symbols = lexeme.getComponents();
                    symbols.forEach(symbol -> {
                        Symbol symbolLeaf = (Symbol) symbol;
                        text.append(symbolLeaf.getValue());
                    });
                    text.append(SPACE_CHARACTER);
                });
            });
            text.append(LINE_FEED_CHARACTER);
        });
        return text.toString();
    }
}
