package verhaltensmuster.visitor;

public abstract class KFZ implements IVisitable {

    @Override
    public abstract void accept(Visitor visitor);
}
