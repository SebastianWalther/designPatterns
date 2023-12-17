package verhaltensmuster.chainOfResposibility;

public class RadioSkill implements AlexaSkill {
    @Override
    public boolean canHandleRequest(String request) {
        return request == "Radio";
    }

    @Override
    public void handleRequest(String request) {
        System.out.println("schalte Radio ein");
    }
}
