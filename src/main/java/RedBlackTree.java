import java.awt.*;

public class RedBlackTree {

    private class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;

        @Override
        public String toString() {
            return "Node{" + "value" + value + ", color=" + color + "}";
        }
    }
    private enum Color{
        RED, BLACK
    }
}
