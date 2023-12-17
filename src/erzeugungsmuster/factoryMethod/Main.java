package erzeugungsmuster.factoryMethod;

public class Main {
    public static void main(String[] args) {
        var ikeaKoeln = new IKEA("Koeln");
        var ikeaHamburg = new IKEA("Hamburg");

        var stuhl = ikeaHamburg.verkaufen("Stuhl");
        stuhl.montieren();
        stuhl.benutzen();
        stuhl = null;

        var tisch = ikeaHamburg.verkaufen("Tisch");
        tisch.montieren();
        tisch.benutzen();
        tisch = null;

        var lampe = ikeaHamburg.verkaufen("Lampe");
    }
}
