package verhaltensmuster.chainOfResposibility;

public class Main {
    public static void main(String[] args) {
        var alexa = new Alexa();

        alexa.addSkill(new WettervorhersagenSkill());
        alexa.addSkill(new RadioSkill());
        alexa.addSkill(new LampenSkill());

        alexa.bearbeiteAnfrage("Wetter");
        alexa.bearbeiteAnfrage("Lampe");
        alexa.bearbeiteAnfrage("Radio");
        alexa.bearbeiteAnfrage("Nichts");

    }
}
