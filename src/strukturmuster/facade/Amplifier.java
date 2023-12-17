package strukturmuster.facade;

public class Amplifier {
    String _description;
    Tuner _tuner;
    DvdPlayer _dvd;
    CdPlayer _cd;

    public Amplifier(String description) {
        _description = description;
    }

    public void On() {
        System.out.println(_description + " on");
    }

    public void Off() {
        System.out.println(_description + " off");
    }

    public void SetStereoSound() {
        System.out.println(_description + " stereo mode on");
    }

    public void SetSurroundSound() {
        System.out.println(_description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void SetVolume(int level) {
        System.out.println(_description + " setting volume to " + level);
    }

    public void SetTuner(Tuner tuner) {
        System.out.println(_description + " setting tuner to " + _dvd);
        _tuner = tuner;
    }

    public void SetDvd(DvdPlayer dvd) {
        System.out.println(_description + " setting DVD player to " + dvd);
        _dvd = dvd;
    }

    public void SetCd(CdPlayer cd) {
        System.out.println(_description + " setting CD player to " + cd);
        _cd = cd;
    }

    public String toString() {
        return _description;
    }
}
