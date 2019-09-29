package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphComponentParser implements ComponentParser {
    private static final String SENTENCE_REGEXP = " *(([A-z][^.!?]+)(\\.{3}|!|\\?|\\.)) *";
    private static ComponentParser nextComponentParser = new SentenceComponentParser();

    @Override
    public Component parse(String paragraph) {
        Component paragraphComponent = new Composite();
        Pattern sentencePattern = Pattern.compile(SENTENCE_REGEXP);
        Matcher matcher = sentencePattern.matcher(paragraph);
        while (matcher.find()) {
            String sentence = matcher.group(1);
            Component sentenceComponent = nextComponentParser.parse(sentence);
            paragraphComponent.addComponent(sentenceComponent);
        }
        return paragraphComponent;
    }
}
