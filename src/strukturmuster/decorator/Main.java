package strukturmuster.decorator;

public class Main {

    public static void main(String[] args) {
        var buch = new Buch("Design Patterns");
        var ausleihbarsBuch = new AusleihbaresBuch(buch);

        buch.show();

        ausleihbarsBuch.ausleihen("Mike");
        ausleihbarsBuch.show();

        ausleihbarsBuch.zurueckgeben();
        ausleihbarsBuch.show();

    }
}
