package erzeugungsmuster.factoryMethod;

public class Tisch extends Moebel{

    @Override
    public void montieren() {
        System.out.println("montiere Tisch");
    }

    @Override
    public void benutzen() {
        System.out.println("benutze Tisch");
    }
}
