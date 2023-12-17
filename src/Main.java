import verhaltensmuster.strategie.Firma;
import verhaltensmuster.strategie.Maler;
import verhaltensmuster.strategie.Schreiner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var firma = new Firma();
        firma.einstellen(new Maler());
        firma.produziere();

        var firma2 = new Firma();
        firma2.einstellen(new Schreiner());
        firma2.produziere();
    }
}