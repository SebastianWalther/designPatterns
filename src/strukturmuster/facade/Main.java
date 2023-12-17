package strukturmuster.facade;

public class Main {

    public static void main(String[] args) {
        var filmAbendAbspieler = new HomeTheaterFacacde();
        filmAbendAbspieler.starteFilmabend();
        filmAbendAbspieler.beendeFilmabend();
    }
}
