package verhaltensmuster.state;

public class Telefon {

    private Telefonzustand telefonZustand = new Aufgelegt();

    private TelefonzustandEnum telefonZustandEnum = TelefonzustandEnum.AUFGELEGT;

    public void abheben() {
        //telefonZustand = telefonZustand.abheben();
        telefonZustandEnum = telefonZustandEnum.abheben();
    }

    public void anrufAnnehmen() {
        //telefonZustand = telefonZustand.anrufAnnehmen();
        telefonZustandEnum = telefonZustandEnum.anrufAnnehmen();
    }


    public void auflegen() {
        //telefonZustand = telefonZustand.auflegen();
        telefonZustandEnum = telefonZustandEnum.auflegen();
    }

    public void waehlen() {
        //telefonZustand = telefonZustand.waehlen();
        telefonZustandEnum = telefonZustandEnum.waehlen();
    }

    public void sprechen() {
        //telefonZustand = telefonZustand.sprechen();
        telefonZustandEnum = telefonZustandEnum.sprechen();
    }

}
