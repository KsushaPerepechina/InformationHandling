package by.epam.informationhandling.composite;

import java.util.List;
import java.util.Objects;

public class Leaf implements Component {
    private String value;

    public Leaf(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(value, leaf.value);//TODO do not use Object
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);//TODO do not use Object
    }
}
