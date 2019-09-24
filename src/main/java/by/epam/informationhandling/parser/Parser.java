package by.epam.informationhandling.parser;

import by.epam.informationhandling.composite.Component;

public interface Parser {
    Component parse(String inputString);
}
