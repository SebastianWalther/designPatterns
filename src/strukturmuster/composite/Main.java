package strukturmuster.composite;

public class Main {

    public static void main(String[] args) {

        var bauteil1 = new Bauteil("Bauteil1", 1.0);
        var bauteil2 = new Bauteil("Bauteil2", 2.0);
        var bauteil3 = new Bauteil("Bauteil3", 3.0);
        var bauteil4 = new Bauteil("Bauteil4", 4.0);
        var bauteil5 = new Bauteil("Bauteil5", 5.0);
        var bauteil6 = new Bauteil("Bauteil6", 6.0);

        var baugruppe0 = new Baugruppe("BauGruppe0");
        var baugruppe1 = new Baugruppe("BauGruppe1");
        var baugruppe2 = new Baugruppe("BauGruppe2");


        baugruppe1.add(bauteil1).add(bauteil2).add(bauteil3);
        baugruppe2.add(bauteil4).add(bauteil5);
        baugruppe0.add(baugruppe1).add(baugruppe2).add(bauteil6).show();
    }
}
