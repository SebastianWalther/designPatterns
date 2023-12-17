package verhaltensmuster.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Beobachter implements PropertyChangeListener {

    private String name;

    Beobachter(String name) {
        this.name = name;
    }

    public void propertyChange(PropertyChangeEvent event) {
        System.out.println(this.name + " - " + event.getPropertyName() + ": Value changed " + event.getOldValue() + " -> " + event.getNewValue());
    }
}
