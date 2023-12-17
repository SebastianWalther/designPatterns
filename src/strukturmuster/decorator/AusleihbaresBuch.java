package strukturmuster.decorator;

public class AusleihbaresBuch extends Buch{

    private Buch buch;
    private String ausgeliehenAn;
    AusleihbaresBuch(Buch buch) {
        super("");
        this.buch=buch;
    }

    void ausleihen(String ausgeliehenAn){
        this.ausgeliehenAn = ausgeliehenAn;
    }
    void zurueckgeben(){
        this.ausgeliehenAn="";
    }

    @Override
    public String getTitel() {
        return buch.getTitel();
    }

    @Override
    void show() {
        buch.show();
        System.out.println("Ausgeliehen an: "+ ausgeliehenAn);
    }
}
