package strukturmuster.adapter;

public class AndroidHandy {

    public void aufladen(UsbNetzteil netzteil) {
        String strom = netzteil.liefereStromViaUsb();
        System.out.println("lade AndroidHandy mit Strom  " + strom);
    }
}
