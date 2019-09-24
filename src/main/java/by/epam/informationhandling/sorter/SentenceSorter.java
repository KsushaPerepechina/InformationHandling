package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;

import java.util.Comparator;
import java.util.List;

public class SentenceSorter {
    public void sortSentencesByLexemesNumber(Component paragraph) {
        List<Component> sentences = paragraph.getComponents();
        sentences.sort(Comparator.comparing(sentence -> sentence.getComponents().size()));
    }
}
