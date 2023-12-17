package strukturmuster.facade;

public class Projector {
    String _description;
    DvdPlayer _dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        _description = description;
        _dvdPlayer = dvdPlayer;
    }

    public void On() {
        System.out.println(_description + " on");
    }

    public void Off() {
        System.out.println(_description + " off");
    }

    public void WideScreenMode() {
        System.out.println(_description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void TvMode() {
        System.out.println(_description + " in tv mode (4x3 aspect ratio)");
    }

    public String toString() {
        return _description;
    }
}
