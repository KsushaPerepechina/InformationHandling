package by.epam.informationhandling;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import by.epam.informationhandling.composite.Symbol;

public class TextDataComponent {
    public static final String text = "\tYes. Java supports OOP. OOP is supported by Java. \n\tOOP is supported by Java. Java supports OOP. \n";

    public static final Component aSymbolComponent = new Symbol('a');
    public static final Component bSymbolComponent = new Symbol('b');
    public static final Component dSymbolComponent = new Symbol('d');
    public static final Component eSymbolComponent = new Symbol('e');
    public static final Component iSymbolComponent = new Symbol('i');
    public static final Component uppercaseJSymbolComponent = new Symbol('J');
    public static final Component uppercaseOSymbolComponent = new Symbol('O');
    public static final Component oSymbolComponent = new Symbol('o');
    public static final Component uppercasePSymbolComponent = new Symbol('P');
    public static final Component pSymbolComponent = new Symbol('p');
    public static final Component rSymbolComponent = new Symbol('r');
    public static final Component sSymbolComponent = new Symbol('s');
    public static final Component tSymbolComponent = new Symbol('t');
    public static final Component uSymbolComponent = new Symbol('u');
    public static final Component vSymbolComponent = new Symbol('v');
    public static final Component uppercaseYSymbolComponent = new Symbol('Y');
    public static final Component ySymbolComponent = new Symbol('y');
    public static final Component pointSymbolComponent = new Symbol('.');

    public static final Component javaLexeme = new Composite();
    public static final Component supportsLexeme = new Composite();
    public static final Component oopWithPointLexeme = new Composite();
    public static final Component oopLexeme = new Composite();
    public static final Component isLexeme = new Composite();
    public static final Component supportedLexeme = new Composite();
    public static final Component byLexeme = new Composite();
    public static final Component javaWithPointLexeme = new Composite();
    public static final Component yesWithPointLexeme = new Composite();

    public static final Component simpleSentence = new Composite();
    public static final Component passiveVoiceSentence = new Composite();
    public static final Component confirmationSentence = new Composite();

    public static final Component firstParagraph = new Composite();
    public static final Component secondParagraph = new Composite();

    public static final Component textComponent = new Composite();


    static {
        javaLexeme.addComponent(uppercaseJSymbolComponent);
        javaLexeme.addComponent(aSymbolComponent);
        javaLexeme.addComponent(vSymbolComponent);
        javaLexeme.addComponent(aSymbolComponent);

        supportsLexeme.addComponent(sSymbolComponent);
        supportsLexeme.addComponent(uSymbolComponent);
        supportsLexeme.addComponent(pSymbolComponent);
        supportsLexeme.addComponent(pSymbolComponent);
        supportsLexeme.addComponent(oSymbolComponent);
        supportsLexeme.addComponent(rSymbolComponent);
        supportsLexeme.addComponent(tSymbolComponent);
        supportsLexeme.addComponent(sSymbolComponent);

        oopWithPointLexeme.addComponent(uppercaseOSymbolComponent);
        oopWithPointLexeme.addComponent(uppercaseOSymbolComponent);
        oopWithPointLexeme.addComponent(uppercasePSymbolComponent);
        oopWithPointLexeme.addComponent(pointSymbolComponent);

        oopLexeme.addComponent(uppercaseOSymbolComponent);
        oopLexeme.addComponent(uppercaseOSymbolComponent);
        oopLexeme.addComponent(uppercasePSymbolComponent);

        isLexeme.addComponent(iSymbolComponent);
        isLexeme.addComponent(sSymbolComponent);

        supportedLexeme.addComponent(sSymbolComponent);
        supportedLexeme.addComponent(uSymbolComponent);
        supportedLexeme.addComponent(pSymbolComponent);
        supportedLexeme.addComponent(pSymbolComponent);
        supportedLexeme.addComponent(oSymbolComponent);
        supportedLexeme.addComponent(rSymbolComponent);
        supportedLexeme.addComponent(tSymbolComponent);
        supportedLexeme.addComponent(eSymbolComponent);
        supportedLexeme.addComponent(dSymbolComponent);

        byLexeme.addComponent(bSymbolComponent);
        byLexeme.addComponent(ySymbolComponent);

        javaWithPointLexeme.addComponent(uppercaseJSymbolComponent);
        javaWithPointLexeme.addComponent(aSymbolComponent);
        javaWithPointLexeme.addComponent(vSymbolComponent);
        javaWithPointLexeme.addComponent(aSymbolComponent);
        javaWithPointLexeme.addComponent(pointSymbolComponent);

        yesWithPointLexeme.addComponent(uppercaseYSymbolComponent);
        yesWithPointLexeme.addComponent(eSymbolComponent);
        yesWithPointLexeme.addComponent(sSymbolComponent);
        yesWithPointLexeme.addComponent(pointSymbolComponent);

        simpleSentence.addComponent(javaLexeme);
        simpleSentence.addComponent(supportsLexeme);
        simpleSentence.addComponent(oopWithPointLexeme);

        passiveVoiceSentence.addComponent(oopLexeme);
        passiveVoiceSentence.addComponent(isLexeme);
        passiveVoiceSentence.addComponent(supportedLexeme);
        passiveVoiceSentence.addComponent(byLexeme);
        passiveVoiceSentence.addComponent(javaWithPointLexeme);

        confirmationSentence.addComponent(yesWithPointLexeme);

        firstParagraph.addComponent(confirmationSentence);
        firstParagraph.addComponent(simpleSentence);
        firstParagraph.addComponent(passiveVoiceSentence);

        secondParagraph.addComponent(passiveVoiceSentence);
        secondParagraph.addComponent(simpleSentence);

        textComponent.addComponent(firstParagraph);
        textComponent.addComponent(secondParagraph);
    }
}
