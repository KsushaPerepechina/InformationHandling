package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import by.epam.informationhandling.composite.Leaf;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParserTest {
    private Parser lexemeParser;
    private Parser sentenceParser;
    private Parser paragraphParser;
    private Parser textParser;

    private String lexeme = "Java";
    private String sentence = "Java supports OOP.";
    private String paragraph = "Java supports OOP. OOP is supported by Java.";
    private String text = "\tJava supports OOP. OOP is supported by Java.\n\tOOP is supported by Java. Java supports OOP.\n";

    private Component uppercaseJSymbolComponent = new Leaf("J");
    private Component aSymbolComponent = new Leaf("a");
    private Component vSymbolComponent = new Leaf("v");
    private Component sSymbolComponent = new Leaf("s");
    private Component uSymbolComponent = new Leaf("u");
    private Component pSymbolComponent = new Leaf("p");
    private Component oSymbolComponent = new Leaf("o");
    private Component rSymbolComponent = new Leaf("r");
    private Component tSymbolComponent = new Leaf("t");
    private Component eSymbolComponent = new Leaf("e");
    private Component dSymbolComponent = new Leaf("d");
    private Component uppercaseOSymbolComponent = new Leaf("O");
    private Component uppercasePSymbolComponent = new Leaf("P");
    private Component iSymbolComponent = new Leaf("i");
    private Component bSymbolComponent = new Leaf("b");
    private Component ySymbolComponent = new Leaf("y");
    private Component pointSymbolComponent = new Leaf(".");

    private Component javaLexeme;
    private Component supportsLexeme;
    private Component oopLexeme;
    private Component isLexeme;
    private Component supportedLexeme;
    private Component byLexeme;

    private Component simpleSentence;
    private Component passiveVoiceSentence;

    private Component firstParagraph;
    private Component secondParagraph;

    private Component textComponent;

    @BeforeClass
    public void setUp() {
        lexemeParser = new LexemeParser();
        sentenceParser = new SentenceParser();
        paragraphParser = new ParagraphParser();
        textParser = new ParagraphParser();

        javaLexeme = new Composite();
        javaLexeme.addComponent(uppercaseJSymbolComponent);
        javaLexeme.addComponent(aSymbolComponent);
        javaLexeme.addComponent(vSymbolComponent);
        javaLexeme.addComponent(aSymbolComponent);

        supportsLexeme = new Composite();
        supportsLexeme.addComponent(sSymbolComponent);
        supportsLexeme.addComponent(uSymbolComponent);
        supportsLexeme.addComponent(pSymbolComponent);
        supportsLexeme.addComponent(pSymbolComponent);
        supportsLexeme.addComponent(oSymbolComponent);
        supportsLexeme.addComponent(rSymbolComponent);
        supportsLexeme.addComponent(tSymbolComponent);
        supportsLexeme.addComponent(sSymbolComponent);

        oopLexeme = new Composite();
        oopLexeme.addComponent(uppercaseOSymbolComponent);
        oopLexeme.addComponent(uppercaseOSymbolComponent);
        oopLexeme.addComponent(uppercasePSymbolComponent);
        oopLexeme.addComponent(pointSymbolComponent);

        isLexeme = new Composite();
        oopLexeme.addComponent(iSymbolComponent);
        oopLexeme.addComponent(sSymbolComponent);

        supportedLexeme = new Composite();
        supportedLexeme.addComponent(sSymbolComponent);
        supportedLexeme.addComponent(uSymbolComponent);
        supportedLexeme.addComponent(pSymbolComponent);
        supportedLexeme.addComponent(pSymbolComponent);
        supportedLexeme.addComponent(oSymbolComponent);
        supportedLexeme.addComponent(rSymbolComponent);
        supportedLexeme.addComponent(tSymbolComponent);
        supportedLexeme.addComponent(eSymbolComponent);
        supportedLexeme.addComponent(dSymbolComponent);

        byLexeme = new Composite();
        byLexeme.addComponent(bSymbolComponent);
        byLexeme.addComponent(ySymbolComponent);

        simpleSentence = new Composite();
        simpleSentence.addComponent(javaLexeme);
        simpleSentence.addComponent(supportsLexeme);
        simpleSentence.addComponent(oopLexeme);

        passiveVoiceSentence = new Composite();
        passiveVoiceSentence.addComponent(oopLexeme);
        passiveVoiceSentence.addComponent(isLexeme);
        passiveVoiceSentence.addComponent(supportedLexeme);
        passiveVoiceSentence.addComponent(byLexeme);
        passiveVoiceSentence.addComponent(javaLexeme);

        firstParagraph = new Composite();
        firstParagraph.addComponent(simpleSentence);
        firstParagraph.addComponent(passiveVoiceSentence);

        secondParagraph = new Composite();
        secondParagraph.addComponent(passiveVoiceSentence);
        secondParagraph.addComponent(simpleSentence);

        textComponent = new Composite();
        textComponent.addComponent(firstParagraph);
        textComponent.addComponent(secondParagraph);
    }

    @Test
    public void parseLexemeTest() {
        Component actual = lexemeParser.parse(lexeme);
        Assert.assertEquals(actual, javaLexeme);
    }

    @Test
    public void parseSentenceTest() {
        Component actual = sentenceParser.parse(sentence);
        Assert.assertEquals(actual, simpleSentence);
    }

    @Test
    public void parseParagraphTest() {
        Component actual = paragraphParser.parse(paragraph);
        Assert.assertEquals(actual, firstParagraph);
    }

    @Test
    public void parseTextTest() {
        Component actual = textParser.parse(text);
        Assert.assertEquals(actual, textComponent);
    }
}
