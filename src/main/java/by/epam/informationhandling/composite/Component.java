package by.epam.informationhandling.composite;

import java.util.List;

public interface Component {
    void addComponent(Component component);
    void removeComponent(Component component);
    List<Component> getComponents();
}
