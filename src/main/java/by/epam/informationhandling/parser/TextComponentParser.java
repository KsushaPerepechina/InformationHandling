package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;
import by.epam.informationhandling.composite.Composite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextComponentParser implements ComponentParser {
    private static final String PARAGRAPH_REGEXP = "\\t([^\\t]+)\\n";
    private static ComponentParser nextComponentParser = new ParagraphComponentParser();

    @Override
    public Component parse(String text) {
        Component textComponent = new Composite();
        Pattern paragraphPattern = Pattern.compile(PARAGRAPH_REGEXP);
        Matcher matcher = paragraphPattern.matcher(text);
        while (matcher.find()) {
            String paragraph = matcher.group(1);
            Component paragraphComponent = nextComponentParser.parse(paragraph);
            textComponent.addComponent(paragraphComponent);
        }
        return textComponent;
    }
}
