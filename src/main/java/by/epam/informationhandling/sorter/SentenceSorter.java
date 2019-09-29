package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Symbol;

import java.util.Comparator;
import java.util.List;

public class SentenceSorter {
    public void sortSentencesByWordsNumber(Component paragraph) {
        List<Component> sentences = paragraph.getComponents();
        sentences.sort(Comparator.comparing(sentence -> sentence.getComponents().stream()
                .filter(lexeme -> lexeme.getComponents().stream().anyMatch(component -> {
                Symbol symbol = (Symbol) component;
                return !symbol.isPunctuationMark();
            })).count()));
    }
}
