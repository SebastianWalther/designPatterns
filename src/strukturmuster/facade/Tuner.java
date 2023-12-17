package strukturmuster.facade;


public class Tuner {
    String _description;
    Amplifier _amplifier;
    double _frequency;

    public Tuner(String description, Amplifier amplifier) {

        _description = description;
        _amplifier = amplifier;
    }

    public void On() {
        System.out.println(_description + " on");
    }

    public void Off() {
        System.out.println(_description + " off");
    }

    public void SetFrequency(double frequency) {
        System.out.println(_description + " setting frequency to " + frequency);
        _frequency = frequency;
    }

    public void SetAm() {
        System.out.println(_description + " setting AM mode");
    }

    public void SetFm() {
        System.out.println(_description + " setting FM mode");
    }

    public String toString() {
        return _description;
    }
}
