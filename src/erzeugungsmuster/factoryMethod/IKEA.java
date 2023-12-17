package erzeugungsmuster.factoryMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IKEA {

    // @ToDo: Lager könnte man auslagern in eine Klasse
    private Map<String, Moebel> lager = new HashMap<>();

    private String filiale;

    public IKEA(String filiale) {
        this.filiale = filiale;
        lager.put("Tisch", new Tisch());
        lager.put("Stuhl", new Stuhl());
    }

    // Fabrik-Methode zum erzeugen von heterogenen Objekten. Alternativer Name: create()
    public Moebel verkaufen(String moebel) {
        System.out.println("verkaufe: " + moebel);
        if(lager.get(moebel) == null) {
            System.out.println(moebel + " nicht vorhanden");
            return null;
        }
        return lager.get(moebel);
    }
}
