package org.example;

public class Node {
    private Squirrel data;
    private Node left;
    private Node right;

    public Node(Squirrel data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public Node left() {
        return this.left;
    }

    public Node right() {
        return this.right;
    }

    public Squirrel getData() {
        return this.data;
    }
}