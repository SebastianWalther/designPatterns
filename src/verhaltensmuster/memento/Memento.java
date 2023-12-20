package verhaltensmuster.memento;

public class Memento {
    private final String zustand;

    Memento(String zustand) {
        this.zustand = zustand;
    }

    public String getZustand() {
        return this.zustand;
    }
}
