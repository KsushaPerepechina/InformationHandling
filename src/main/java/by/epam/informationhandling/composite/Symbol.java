package by.epam.informationhandling.composite;

import java.util.List;
import java.util.StringJoiner;

public class Symbol implements Component {
    private static final String PUNCTUATION_MARK_REGEXP = "[^A-Za-z0-9]";
    private char value;
    private boolean punctuationMark;

    public Symbol(char value) {
        this.value = value;
        if (String.valueOf(value).matches(PUNCTUATION_MARK_REGEXP)) {
            punctuationMark = true;
        }
    }

    public char getValue() {
        return value;
    }

    public boolean isPunctuationMark() {
        return punctuationMark;
    }

    public void addComponent(Component c) {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(Component c) {
        throw new UnsupportedOperationException();
    }

    public List<Component> getComponents() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Symbol symbol = (Symbol) o;
        return value == symbol.value;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Symbol.class.getSimpleName() + "[", "]")
                .add("value=" + value)
                .add("punctuationMark=" + punctuationMark)
                .toString();
    }
}
