package verhaltensmuster.chainOfResposibility;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Alexa {

    private List<AlexaSkill> skills = new ArrayList();

    public void bearbeiteAnfrage(String request) {
        var found = skills.stream().filter(s -> s.canHandleRequest(request)).findFirst();
        if(found.isPresent()) {
            found.get().handleRequest(request);
            return;
        }
        throw new IllegalStateException("Skill nicht gefunden");
    }

    public void addSkill(AlexaSkill skill) {
        this.skills.add(skill);
    }
}
