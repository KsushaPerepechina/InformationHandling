package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Leaf;

import java.util.Comparator;
import java.util.List;

public class LexemeSorter {//TODO sort words instead lexemes
    public void sortLexemesByLength(Component sentence) {
        List<Component> lexemes = sentence.getComponents();
        lexemes.sort(Comparator.comparing(lexeme -> lexeme.getComponents().size()));
    }

    public void sortLexemesByOccurrencesNumberSpecifiedSymbol(Component sentence, char symbol) {//TODO alphabet sorting
        List<Component> lexemes = sentence.getComponents();
        lexemes.sort(Comparator.comparing(lexeme -> lexeme.getComponents().stream().filter(x -> {
            Leaf symbolComponent = (Leaf)x;
            String character = symbolComponent.getValue().toLowerCase();
            return character.equals(String.valueOf(symbol).toLowerCase());
        }).count()));
    }
}