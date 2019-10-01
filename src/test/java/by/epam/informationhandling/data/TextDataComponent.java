package by.epam.informationhandling.data;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;
import by.epam.informationhandling.composite.Symbol;

public class TextDataComponent {
    public static final String text = "\tYes. Java supports OOP. OOP is supported by Java. \n\tOOP is supported by Java. Java supports OOP. \n";
    public static final Component TEXT_COMPONENT;


    static {
        Component aSymbolComponent = new Symbol('a');
        Component bSymbolComponent = new Symbol('b');
        Component dSymbolComponent = new Symbol('d');
        Component eSymbolComponent = new Symbol('e');
        Component iSymbolComponent = new Symbol('i');
        Component uppercaseJSymbolComponent = new Symbol('J');
        Component uppercaseOSymbolComponent = new Symbol('O');
        Component oSymbolComponent = new Symbol('o');
        Component uppercasePSymbolComponent = new Symbol('P');
        Component pSymbolComponent = new Symbol('p');
        Component rSymbolComponent = new Symbol('r');
        Component sSymbolComponent = new Symbol('s');
        Component tSymbolComponent = new Symbol('t');
        Component uSymbolComponent = new Symbol('u');
        Component vSymbolComponent = new Symbol('v');
        Component uppercaseYSymbolComponent = new Symbol('Y');
        Component ySymbolComponent = new Symbol('y');
        Component pointSymbolComponent = new Symbol('.');

        Component javaLexeme = new Composite();
        Component supportsLexeme = new Composite();
        Component oopWithPointLexeme = new Composite();
        Component oopLexeme = new Composite();
        Component isLexeme = new Composite();
        Component supportedLexeme = new Composite();
        Component byLexeme = new Composite();
        Component javaWithPointLexeme = new Composite();
        Component yesWithPointLexeme = new Composite();

        Component simpleSentence = new Composite();
        Component passiveVoiceSentence = new Composite();
        Component confirmationSentence = new Composite();

        Component firstParagraph = new Composite();
        Component secondParagraph = new Composite();

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

        TEXT_COMPONENT = new Composite();
        TEXT_COMPONENT.addComponent(firstParagraph);
        TEXT_COMPONENT.addComponent(secondParagraph);
    }
}
