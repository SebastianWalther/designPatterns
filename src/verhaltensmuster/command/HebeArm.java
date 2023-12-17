package verhaltensmuster.command;

public class HebeArm extends Befehl{

    @Override
    public void ausfueren(Roboter roboter) {
        roboter.hebeArm();
    }
    @Override
    public void rueckgaenig(Roboter roboter){
        roboter.senkeArm();
    }
}