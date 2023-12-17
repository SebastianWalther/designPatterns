package strukturmuster.facade;

public class HomeTheaterFacacde {
    //TODO: Die Felder müssen aufgrund der Testbarkeit noch injected werden!
    Amplifier amplifier = new Amplifier("Amplifier");
    CdPlayer cdPlayer = new CdPlayer("CdPlayer", amplifier);
    DvdPlayer dvdPlayer = new DvdPlayer("DvdPlayer", amplifier);

    PopcornPopper popcornPopper = new PopcornPopper("PopcornPopper");
    Projector projector = new Projector("Projector", dvdPlayer);
    Screen screen = new Screen("Screen");
    TheaterLights theaterLights = new TheaterLights("TheaterLights");
    Tuner tuner = new Tuner("Tuner", amplifier);


    public void starteFilmabend() {
        amplifier.On();
        cdPlayer.On();
        dvdPlayer.On();
        popcornPopper.On();
        projector.On();
        screen.Down();
        theaterLights.On();
        theaterLights.Dim(3);
        tuner.On();

    }

    public void beendeFilmabend() {
        amplifier.Off();
        cdPlayer.Off();
        dvdPlayer.Off();
        popcornPopper.Off();
        projector.Off();
        screen.Up();
        theaterLights.Off();
        tuner.Off();
    }
}
