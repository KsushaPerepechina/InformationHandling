package by.epam.informationhandling.sorter;

import by.epam.informationhandling.TextDataComponent;
import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WordSorterTest {
    private WordSorter wordSorter;
    private Component sentence;

    @BeforeClass
    public void setUp() {
        wordSorter = new WordSorter();
        sentence = TextDataComponent.simpleSentence;
    }

    @Test
    public void parseTextTest() {
        Component expected = new Composite();
        expected.addComponent(TextDataComponent.oopWithPointLexeme);
        expected.addComponent(TextDataComponent.javaLexeme);
        expected.addComponent(TextDataComponent.supportsLexeme);
        wordSorter.sortWordsByLength(sentence);
        Assert.assertEquals(sentence, expected);
    }
}
