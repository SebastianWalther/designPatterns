package verhaltensmuster.command;

public class SenkeArm extends Befehl{

    @Override
    public void ausfueren(Roboter roboter) {
        roboter.senkeArm();
    }

    @Override
    public void rueckgaenig(Roboter roboter){
        roboter.hebeArm();
    }
}
