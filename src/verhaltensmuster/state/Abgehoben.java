package verhaltensmuster.state;

public class Abgehoben extends Telefonzustand {

    @Override
    public Telefonzustand waehlen() {
        System.out.println("wählen");
        return new Verbunden();
    }

    @Override
    public Telefonzustand auflegen() {
        System.out.println("aufgelegt");
        return new Aufgelegt();
    }
}
