package verhaltensmuster.chainOfResposibility;

public interface AlexaSkill {

    public boolean canHandleRequest(String request);

    public void handleRequest(String request);
}
