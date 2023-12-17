package strukturmuster.adapter;

public class AdapterAufUsb extends UsbNetzteil {

    private AppleNetzteil appleNetzteil;

    public AdapterAufUsb(AppleNetzteil appleNetzteil) {

        this.appleNetzteil = appleNetzteil;
    }

    @Override
    public String liefereStromViaUsb() {
        return appleNetzteil.liefereStromViaLightning();
    }
}
