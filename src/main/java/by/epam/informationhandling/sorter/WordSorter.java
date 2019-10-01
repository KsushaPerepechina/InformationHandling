package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Symbol;

import java.util.Comparator;
import java.util.List;

public class WordSorter {
    public void sortWordsByLength(Component sentence) {
        List<Component> lexemes = sentence.getComponents();
        lexemes.sort(Comparator.comparing(lexeme -> lexeme.getComponents().stream().filter(component -> {
            Symbol symbol = (Symbol)component;
            return !symbol.isPunctuationMark();
        }).count()));
    }
}