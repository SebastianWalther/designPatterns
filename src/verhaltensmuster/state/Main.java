package verhaltensmuster.state;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        telefon.abheben();
        telefon.waehlen();
        telefon.auflegen();
        //telefon.waehlen();
    }
}
