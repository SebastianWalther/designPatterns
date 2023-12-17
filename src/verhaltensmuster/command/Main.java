package verhaltensmuster.command;

public class Main {
    public static void main(String[] args) {
    var roboter = new Roboter();
    var makroBefehl  = new  MakroBefehl();
        makroBefehl.add(new HebeArm());
        makroBefehl.add(new HebeArm());
        makroBefehl.add(new SenkeArm());
        makroBefehl.add(new HebeArm());


        var makroBefehl2  = new  MakroBefehl();
        makroBefehl2.add(new HebeArm());
        makroBefehl2.add(new HebeArm());
        makroBefehl2.add(new SenkeArm());
        makroBefehl2.add(new HebeArm());

        makroBefehl.add(makroBefehl2);
        makroBefehl.ausfueren(roboter);
        makroBefehl.rueckgaenig(roboter);
    }
}
