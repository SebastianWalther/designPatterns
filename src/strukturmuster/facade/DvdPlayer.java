package strukturmuster.facade;

public class DvdPlayer {
    String _description;
    int _currentTrack;
    Amplifier _amplifier;
    String _movie;

    public DvdPlayer(String description, Amplifier amplifier) {
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
        _movie = null;
        System.out.println(_description + " eject");
    }

    public void Play(String movie) {
        _movie = movie;
        _currentTrack = 0;
        System.out.println(_description + " playing \"" + movie + "\"");
    }

    public void Play(int track) {
        if (_movie == null) {
            System.out.println(_description + " can't play track " + track + " no dvd inserted");
        } else {
            _currentTrack = track;
            System.out.println(_description + " playing track " + _currentTrack + " of \"" + _movie + "\"");
        }
    }

    public void Stop() {
        _currentTrack = 0;
        System.out.println(_description + " stopped \"" + _movie + "\"");
    }

    public void Pause() {
        System.out.println(_description + " paused \"" + _movie + "\"");
    }

    public void SetTwoChannelAudio() {
        System.out.println(_description + " set two channel audio");
    }

    public void SetSurroundAudio() {
        System.out.println(_description + " set surround audio");
    }

    public String toString() {
        return _description;
    }
}
