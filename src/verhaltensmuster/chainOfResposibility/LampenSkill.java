package verhaltensmuster.chainOfResposibility;

public class LampenSkill implements AlexaSkill {
    @Override
    public boolean canHandleRequest(String request) {
        return request == "Lampe";
    }

    @Override
    public void handleRequest(String request) {
        System.out.println("schalte Licht ein");
    }
}
