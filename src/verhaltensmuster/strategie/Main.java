package verhaltensmuster.strategie;

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