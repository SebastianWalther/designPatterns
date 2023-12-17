package verhaltensmuster.chainOfResposibility;

public class WettervorhersagenSkill implements AlexaSkill {
    @Override
    public boolean canHandleRequest(String request) {
        return request == "Wetter";
    }

    @Override
    public void handleRequest(String request) {
        System.out.println("Heute ist es kalt draußen");
    }
}
