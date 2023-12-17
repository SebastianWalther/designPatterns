package verhaltensmuster.iterator;

public class Main {
    public static void main(String[] args) {
        var records = new String[]{"A", "B", "C", "D", "E"};
        var container = new IterableContainer(records);

        for (var item : container) {
            System.out.println(item);
        }
    }
}
