package by.epam.informationhandling.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Composite composite = (Composite) o;
        return components.equals(composite.components);
    }

    @Override
    public int hashCode() {
        return components.hashCode();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Composite.class.getSimpleName() + "[", "]")
                .add("components=" + components)
                .toString();
    }
}
