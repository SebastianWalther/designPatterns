package erzeugungsmuster.abstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kleiderfabrik kleiderfabrik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 für Herrenkleiderfabrik sonst Damenkleiderfabrik");
        if(scanner.nextInt() == 0) {
            kleiderfabrik = new Herrenkleidefabrik();
        } else {
            kleiderfabrik = new Damenkleiderfabrik();
        }

        Hose hose = kleiderfabrik.erzeugeHose();
        Hemd hemd = kleiderfabrik.erzeugeHemd();

        hemd.anzeigen();
        hose.anzeigen();

    }
}
