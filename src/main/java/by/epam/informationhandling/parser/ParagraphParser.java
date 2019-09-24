package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements Parser {
    private static final String SENTENCE_REGEXP = "([A-z][^.!?]+)(\\.{3}|!|\\?|\\.)";
    private static final Parser SENTENCE_PARSER = new SentenceParser();

    @Override
    public Component parse(String paragraph) {
        Component paragraphComponent = new Composite();
        Pattern sentencePattern = Pattern.compile(SENTENCE_REGEXP);
        Matcher matcher = sentencePattern.matcher(paragraph);
        while (matcher.find()) {
            String sentence = matcher.group();
            Component sentenceComponent = SENTENCE_PARSER.parse(sentence);
            paragraphComponent.addComponent(sentenceComponent);
        }
        return paragraphComponent;
    }
}
