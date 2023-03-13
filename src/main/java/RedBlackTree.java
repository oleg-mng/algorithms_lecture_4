import java.awt.*;

public class RedBlackTree {
    private Node root;

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
    private boolean addNode (Node node, int value){
        if (node.value == value){
            return false;
        }
        else {
            if (node.value > value){
                if (node.leftChild != null){
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                }
                else{
                    node.leftChild = new Node();

                }
            }
        }
    }
}
