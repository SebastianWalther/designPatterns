package strukturmuster.facade;

public class CdPlayer {
    String _description;
    int _currentTrack;
    Amplifier _amplifier;
    String _title;

    public CdPlayer(String description, Amplifier amplifier) {
        _description = description;
        _amplifier = amplifier;
    }

    public void On() {
        System.out.println(_description + " on");
    }

    public void Off() {
        System.out.println(_description + " off");
    }

    public void Eject() {
        _title = null;
        System.out.println(_description + " eject");
    }

    public void Play(String title) {
        _title = title;
        _currentTrack = 0;
        System.out.println(_description + " playing \"" + title + "\"");
    }

    public void Play(int track) {
        if (_title == null) {
            System.out.println(_description + " can't play track " + _currentTrack +
                    ", no cd inserted");
        } else {
            _currentTrack = track;
            System.out.println(_description + " playing track " + _currentTrack);
        }
    }

    public void Stop() {
        _currentTrack = 0;
        System.out.println(_description + " stopped");
    }

    public void Pause() {
        System.out.println(_description + " paused \"" + _title + "\"");
    }

    public String toString() {
        return _description;
    }
}
