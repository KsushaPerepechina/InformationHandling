package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.parser.ComponentParser;
import by.epam.informationhandling.parser.SentenceComponentParser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WordSorterTest {
    private WordSorter wordSorter;
    private ComponentParser sentenceComponentParser;

    @BeforeClass
    public void setUp() {
        wordSorter = new WordSorter();
        sentenceComponentParser = new SentenceComponentParser();
    }

    @Test
    public void parseTextTest() {
        Component actual = sentenceComponentParser.parse("It must execute with high performance.");
        Component expected = sentenceComponentParser.parse("It must with high execute performance.");
        wordSorter.sortWordsByLength(actual);
        Assert.assertEquals(actual, expected);
    }
}
