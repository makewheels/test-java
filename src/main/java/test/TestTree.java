package test;

import lombok.Data;

public class TestTree {
    @Data
    static class Node {
        int data;
        Node left;
        Node right;
    }

    private void printTree(Node root) {
        if (root == null)
            return;
        System.out.println(root.getData());
        if (root.left != null)
            printTree(root.getLeft());
        if (root.right != null)
            printTree(root.getRight());
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.setData(0);

        Node node1 = new Node();
        node1.setData(1);
        root.setLeft(node1);

        Node node2 = new Node();
        node2.setData(2);
        root.setRight(node2);

        Node node3 = new Node();
        node3.setData(3);
        node2.setLeft(node3);

        Node node4 = new Node();
        node4.setData(4);
        node2.setRight(node4);

        new TestTree().printTree(root);
    }
}
