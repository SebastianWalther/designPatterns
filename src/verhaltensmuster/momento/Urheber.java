package verhaltensmuster.momento;

public class Urheber {

    private String zustand;

    Urheber() {

    }

    public void setzteZustand(String zustand) {
        this.zustand = zustand;
    }
    public void zeigeZustand() {
        System.out.println(this.zustand);
    }
    public void setzteMomento(Memento memento) {
        this.zustand = memento.getZustand();
    }

    public Memento erzeugeMemento() {
        return new Memento(this.zustand);
    }
}
