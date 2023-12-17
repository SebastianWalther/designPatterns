package strukturmuster.composite;

public class Bauteil {

    String name;
    double preis;

    Bauteil(String name, double preis){
        this.preis = preis;
        this.name = name;
    }

    public double getPreis(){
        return preis;
    }

    public void show(){
        System.out.println("Bauteil: "+ name +" Preis:" + getPreis());

    }
}
