package verhaltensmuster.command;

import java.util.Vector;

public class MakroBefehl extends Befehl {
    private Vector<Befehl> childBefehle = new Vector<>();

    public void add(Befehl befehl) {
        childBefehle.add(befehl);
    }

    @Override
    public void ausfueren(Roboter roboter) {
        for (Befehl befehl: childBefehle) {
            befehl.ausfueren(roboter);
        }
    }

    @Override
    public void rueckgaenig(Roboter roboter) {
        for (int i = childBefehle.size()-1; i >= 0; i--) {
            var befehl = childBefehle.get(i);
            befehl.rueckgaenig(roboter);
        }
    }
}
