package net.kaczynski.drzewka;

public class Node {
    String value;
    Node left;
    Node right;

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
