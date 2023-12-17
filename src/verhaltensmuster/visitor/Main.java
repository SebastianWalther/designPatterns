package verhaltensmuster.visitor;

public class Main {
    public static void main(String[] args) {
        var fuhrpark = new Fuhrpark();

        fuhrpark.addFahrzeug(new Bus());
        fuhrpark.addFahrzeug(new LKW());

        fuhrpark.acceptVisitor(new ReinigungsVisitor());
        fuhrpark.acceptVisitor(new VersicherungsVisitor());
    }

}
