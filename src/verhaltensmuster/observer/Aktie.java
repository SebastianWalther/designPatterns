package verhaltensmuster.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Aktie {

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private String name;
    private Double kurs;


    public Aktie(String name, Double kurs) {
        this.name = name;
        this.kurs = kurs;
    }

    public void addListener(PropertyChangeListener pcl) {
        pcs.addPropertyChangeListener(pcl);
    }

    public void removeListener(PropertyChangeListener pcl) {
        pcs.removePropertyChangeListener(pcl);
    }

    public void setKurs(Double kurs) {
        this.pcs.firePropertyChange(this.name, this.kurs, kurs);
        this.kurs = kurs;
    }
}
