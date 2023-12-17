package strukturmuster.flyweight;

import java.awt.*;

public class Application {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 3000;
    static int TREE_TYPES = 4;

    public static void main(String[] args) {

        Forest forest = new Forest(new TreeTypeFactory());

        for (int i = 0; i < TREES_TO_DRAW / TREE_TYPES; i++) {

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Oak", Color.GREEN, "Oak texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.BLUE, "Summer Oak texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Winter Oak", Color.RED, "Winter Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
