package verhaltensmuster.visitor;

public class LKW  extends KFZ {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
