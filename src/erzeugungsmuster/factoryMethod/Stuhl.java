package erzeugungsmuster.factoryMethod;

public class Stuhl extends Moebel {
    @Override
    public void montieren() {
        System.out.println("montiere Stuhl");
    }

    @Override
    public void benutzen() {
        System.out.println("benutze Stuhl");
    }
}
