package verhaltensmuster.visitor;

public class VersicherungsVisitor extends Visitor {
    @Override
    public void visit(Bus bus) {
        System.out.println("Der Bus wird versichert");
    }

    @Override
    public void visit(LKW lkw) {
        System.out.println("Der LKW wird versichert");
    }
}
