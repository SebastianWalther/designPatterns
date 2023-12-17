package verhaltensmuster.state;

public class Verbunden extends Telefonzustand {

    @Override
    public Telefonzustand sprechen() {
        System.out.println("sprechen");
        return this;
    }

    @Override
    public Telefonzustand auflegen() {
        System.out.println("auflegen");
        return new Aufgelegt();
    }
}
