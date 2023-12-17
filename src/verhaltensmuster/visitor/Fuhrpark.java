package verhaltensmuster.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fuhrpark {

    List<IVisitable> fahrzeuge = new ArrayList<IVisitable>();

    public void acceptVisitor(Visitor visitor) {
        fahrzeuge.stream().forEach(f -> f.accept(visitor));
    }

    public void addFahrzeug(IVisitable kfz) {
        this.fahrzeuge.add(kfz);
    }
}
