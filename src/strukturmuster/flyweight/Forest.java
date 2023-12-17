package strukturmuster.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private final List<Tree> trees = new ArrayList<>();
    private final TreeTypeFactory treeTypeFactory;

    Forest(TreeTypeFactory treeTypeFactory) {
        this.treeTypeFactory = treeTypeFactory;
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = treeTypeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}


