package erzeugungsmuster.abstractFactory;

public class Herrenkleidefabrik extends Kleiderfabrik {
    @Override
    public Hose erzeugeHose() {
        return new Herrenhose();
    }

    @Override
    public Hemd erzeugeHemd() {
        return new Herrenhemd();
    }
}
