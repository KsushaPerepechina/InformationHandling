package by.epam.informationhandling.action;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.parser.ComponentParser;
import by.epam.informationhandling.parser.TextComponentParser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextConstructorTest {
    private TextConstructor textConstructor;
    private ComponentParser textComponentParser;

    @BeforeClass
    public void setUp() {
        textConstructor = new TextConstructor();
        textComponentParser = new TextComponentParser();
    }

    @Test
    public void parseTextTest() {
        String expected = "\tJava is class-based. OOP is supported by Java. \n" +
                "\tJava is a general-purpose programming language. \n";
        Component textComponent = textComponentParser.parse(expected);
        String actual = textConstructor.restore(textComponent);
        Assert.assertEquals(actual, expected);
    }
}
