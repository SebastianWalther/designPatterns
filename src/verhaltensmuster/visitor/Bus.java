package verhaltensmuster.visitor;

public class Bus extends KFZ {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
