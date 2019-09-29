package by.epam.informationhandling.sorter;

import by.epam.informationhandling.TextDataComponent;
import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParagraphSorterTest {
    private ParagraphSorter paragraphSorter;
    private Component textComponent;

    @BeforeClass
    public void setUp() {
        paragraphSorter = new ParagraphSorter();
        textComponent = TextDataComponent.textComponent;
    }

    @Test
    public void parseTextTest() {
        Component expected = new Composite();
        expected.addComponent(TextDataComponent.secondParagraph);
        expected.addComponent(TextDataComponent.firstParagraph);
        paragraphSorter.sortParagraphsBySentencesNumber(textComponent);
        Assert.assertEquals(textComponent, expected);
    }
}
