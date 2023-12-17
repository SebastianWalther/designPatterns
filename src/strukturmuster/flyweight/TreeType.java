package strukturmuster.flyweight;

import java.awt.*;

public class TreeType {
    public final String name;
    public final Color color;
    public final String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

}
