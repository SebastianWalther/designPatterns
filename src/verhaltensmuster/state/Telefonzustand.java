package verhaltensmuster.state;

public class Telefonzustand {

    public static final String IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH = "im aktuellen Zustand nicht möglich";

    public Telefonzustand abheben() {
       throw new IllegalStateException("Abheben " + IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH);
    }

    public Telefonzustand anrufAnnehmen() {
        throw new IllegalStateException("Anruf annehmen " + IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH);
    }

    public Telefonzustand auflegen() {
        throw new IllegalStateException("Auflegen " + IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH);
    }

    public Telefonzustand waehlen() {
        throw new IllegalStateException("Wählen " + IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH);
    }

    public Telefonzustand sprechen() {
        throw new IllegalStateException("Sprechen " + IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH);
    }
}
