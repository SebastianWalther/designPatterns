package strukturmuster.composite;

import java.util.ArrayList;
import java.util.List;

public class Baugruppe extends Bauteil {

    List<Bauteil> bauteile = new ArrayList<>();

    Baugruppe(String name) {
        super(name,0);
    }

    public Baugruppe add(Bauteil bauteil){
        this.bauteile.add(bauteil);
        return this;
    }
    @Override
    public double getPreis(){
        double gesamtPreis = 0;
        for (Bauteil bauteil: bauteile) {
            gesamtPreis+= bauteil.getPreis();
        }
        return gesamtPreis;
    }

    @Override
    public void show() {
        super.show();
        for (Bauteil bauteil: bauteile) {
           System.out.print(" - ");
            bauteil.show();
        }
    }
}