package verhaltensmuster.visitor;

public class ReinigungsVisitor extends Visitor{
    @Override
    public void visit(Bus bus) {
        System.out.println("Der Bus wird gestaubsaugt mit dem Roboter");
    }

    @Override
    public void visit(LKW lkw) {
        System.out.println("Der LKW wird gestaubsaugt mit dem Dampfstahler");
    }
}
