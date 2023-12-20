package verhaltensmuster.memento;

import java.util.Vector;

public class UndoBuffer {

    private final Vector<Memento> mementos = new Vector();

    private final Urheber urheber;

    UndoBuffer(Urheber urheber) {
        this.urheber = urheber;
    }

    void speichereZustand() {
        mementos.add(urheber.erzeugeMemento());
    }

    public void rueckgaengigZustand(int index) {
        this.urheber.setzteMomento(mementos.get(index));
    }

}
