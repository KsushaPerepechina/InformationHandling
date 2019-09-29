package by.epam.informationhandling.parser;

import by.epam.informationhandling.TextDataComponent;
import by.epam.informationhandling.composite.Component;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextParserTest {
    private ComponentParser textComponentParser;
    private String text;
    private Component textComponent;

    @BeforeClass
    public void setUp() {
        textComponentParser = new TextComponentParser();
        text = TextDataComponent.text;
        textComponent = TextDataComponent.textComponent;
    }

    @Test
    public void parseTextTest() {
        Component actual = textComponentParser.parse(text);
        Assert.assertEquals(actual, textComponent);
    }
}