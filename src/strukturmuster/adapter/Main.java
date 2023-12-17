package strukturmuster.adapter;

public class Main {
    public static void main(String[] args) {
        var appleHandy = new AppleHandy();
        appleHandy.aufladen(new AdapterAufLightning(new UsbNetzteil()));

        var androidHandy = new AndroidHandy();
        androidHandy.aufladen(new AdapterAufUsb(new AppleNetzteil()));
    }
}
