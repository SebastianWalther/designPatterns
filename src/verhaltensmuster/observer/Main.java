package verhaltensmuster.observer;

public class Main {
    public static void main(String[] args) {
        var aktie = new Aktie("Techniker", 0.0);
        var beaobachter1 = new Beobachter("Ob1");
        var beaobachter2 = new Beobachter("Ob2");

        aktie.addListener(beaobachter1);
        aktie.addListener(beaobachter2);

        aktie.setKurs(1.0);
        aktie.setKurs(1.1);
        aktie.setKurs(1.2);
        aktie.setKurs(1.3);


    }
}
