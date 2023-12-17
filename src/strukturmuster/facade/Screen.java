package strukturmuster.facade;

public class Screen {
    String _description;

    public Screen(String description) {
        _description = description;
    }

    public void Up() {
        System.out.println(_description + " going up");
    }

    public void Down() {
        System.out.println(_description + " going down");
    }


    public String toString() {
        return _description;
    }
}
