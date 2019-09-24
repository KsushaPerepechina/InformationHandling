package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;

import java.util.Comparator;
import java.util.List;

public class ParagraphSorter {
    public void sortParagraphsBySentencesNumber(Component text) {
        List<Component> paragraphs = text.getComponents();
        paragraphs.sort(Comparator.comparing(paragraph -> paragraph.getComponents().size()));
    }
}
