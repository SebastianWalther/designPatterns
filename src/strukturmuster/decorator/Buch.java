package strukturmuster.decorator;

public class Buch {

    String titel;

    Buch(String titel){
        this.titel=titel;

    }
    void show(){
        System.out.println(titel);
    }

    public String getTitel() {
        return titel;
    }


}
