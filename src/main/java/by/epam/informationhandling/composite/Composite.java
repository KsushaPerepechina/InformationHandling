package by.epam.informationhandling.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composite composite = (Composite) o;
        return Objects.equals(components, composite.components);//TODO do not use Object
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);//TODO do not use Object
    }
}
