package strukturmuster.adapter;

public class AppleHandy {

    public void aufladen(AppleNetzteil netzteil) {
        String strom = netzteil.liefereStromViaLightning();

        System.out.println("lade AppleHandy mit Strom  " + strom);
    }
}
