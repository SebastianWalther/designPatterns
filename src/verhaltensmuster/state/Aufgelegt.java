package verhaltensmuster.state;

public class Aufgelegt extends Telefonzustand {

    @Override
    public Telefonzustand abheben() {
        System.out.println("abheben");
        return new Abgehoben();
    }

    @Override
    public Telefonzustand anrufAnnehmen() {
        System.out.println("anrufAnnehmen");
        return new Verbunden();
    }
}
