package by.epam.informationhandling.action;

import by.epam.informationhandling.TextDataComponent;
import by.epam.informationhandling.composite.Component;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextConstructorTest {
    private TextConstructor textConstructor;
    private String text;
    private Component textComponent;

    @BeforeClass
    public void setUp() {
        textConstructor = new TextConstructor();
        text = TextDataComponent.text;
        textComponent = TextDataComponent.textComponent;
    }

    @Test
    public void parseTextTest() {
        String actual = textConstructor.restore(textComponent);
        Assert.assertEquals(actual, text);
    }
}
