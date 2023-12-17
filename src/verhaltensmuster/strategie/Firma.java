package verhaltensmuster.strategie;

public class Firma {
    Arbeiter arbeiter;

    public void produziere() {
        if (arbeiter != null) {
            arbeiter.arbeite();
        }
    }

    public void einstellen(Arbeiter arbeiter) {
        this.arbeiter = arbeiter;
    }
}
