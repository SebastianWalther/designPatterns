package strukturmuster.flyweight;

import java.awt.*;

public class Tree {
    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(type.color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
