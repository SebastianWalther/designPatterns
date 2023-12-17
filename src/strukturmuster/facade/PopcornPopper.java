package strukturmuster.facade;

public class PopcornPopper {
    String _description;

    public PopcornPopper(String description) {
        _description = description;
    }

    public void On() {
        System.out.println(_description + " on");
    }

    public void Off() {
        System.out.println(_description + " off");
    }

    public void Pop() {
        System.out.println(_description + " popping popcorn!");
    }


    public String toString() {
        return _description;
    }
}
