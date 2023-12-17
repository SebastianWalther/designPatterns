package strukturmuster.facade;

public class TheaterLights {
    String _description;

    public TheaterLights(String description) {
        _description = description;
    }

    public void On() {
        System.out.println(_description + " on");
    }

    public void Off() {
        System.out.println(_description + " off");
    }

    public void Dim(int level) {
        System.out.println(_description + " dimming to " + level + "%");
    }

    public String toString() {
        return _description;
    }
}
