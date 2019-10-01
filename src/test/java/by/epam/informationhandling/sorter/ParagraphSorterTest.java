package by.epam.informationhandling.sorter;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.parser.ComponentParser;
import by.epam.informationhandling.parser.TextComponentParser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParagraphSorterTest {
    private ParagraphSorter paragraphSorter;
    private ComponentParser textComponentParser;

    @BeforeClass
    public void setUp() {
        paragraphSorter = new ParagraphSorter();
        textComponentParser = new TextComponentParser();
    }

    @Test
    public void parseTextTest() {
        Component actual = textComponentParser.parse("\tJava is class-based. OOP is supported by Java. \n" +
                "\tJava is a general-purpose programming language. \n");
        Component expected = textComponentParser.parse("\tJava is a general-purpose programming language. \n" +
                "\tJava is class-based. OOP is supported by Java. \n");
        paragraphSorter.sortParagraphsBySentencesNumber(actual);
        Assert.assertEquals(actual, expected);
    }
}
