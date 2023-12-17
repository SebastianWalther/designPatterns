package strukturmuster.adapter;

public class AdapterAufLightning extends AppleNetzteil {

    private UsbNetzteil usbNetzteil;

    public AdapterAufLightning(UsbNetzteil usbNetzteil) {
        this.usbNetzteil = usbNetzteil;
    }

    @Override
    public String liefereStromViaLightning() {
        return usbNetzteil.liefereStromViaUsb();
    }
}
