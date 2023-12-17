package erzeugungsmuster.abstractFactory;

public class Damenkleiderfabrik extends Kleiderfabrik {
    @Override
    public Hose erzeugeHose() {
        return new Damenhose();
    }

    @Override
    public Hemd erzeugeHemd() {
        return new Damenhemd();
    }
}
