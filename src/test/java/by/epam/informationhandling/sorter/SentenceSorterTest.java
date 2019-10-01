package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.parser.ComponentParser;
import by.epam.informationhandling.parser.ParagraphComponentParser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SentenceSorterTest {
    private SentenceSorter sentenceSorter;
    private ComponentParser paragraphComponentParser;

    @BeforeClass
    public void setUp() {
        sentenceSorter = new SentenceSorter();
        paragraphComponentParser = new ParagraphComponentParser();
    }

    @Test
    public void parseTextTest() {
        Component actual = paragraphComponentParser.parse("Java is a general-purpose programming language. Java supports OOP.");
        Component expected = paragraphComponentParser.parse("Java supports OOP. Java is a general-purpose programming language.");
        sentenceSorter.sortSentencesByWordsNumber(actual);
        Assert.assertEquals(actual, expected);
    }
}
