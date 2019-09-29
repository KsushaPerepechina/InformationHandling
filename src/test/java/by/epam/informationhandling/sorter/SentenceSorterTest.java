package by.epam.informationhandling.sorter;

import by.epam.informationhandling.TextDataComponent;
import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SentenceSorterTest {
    private SentenceSorter sentenceSorter;
    private Component paragraph;

    @BeforeClass
    public void setUp() {
        sentenceSorter = new SentenceSorter();
        paragraph = TextDataComponent.secondParagraph;
    }

    @Test
    public void parseTextTest() {
        Component expected = new Composite();
        expected.addComponent(TextDataComponent.simpleSentence);
        expected.addComponent(TextDataComponent.passiveVoiceSentence);
        sentenceSorter.sortSentencesByWordsNumber(paragraph);
        Assert.assertEquals(paragraph, expected);
    }
}
