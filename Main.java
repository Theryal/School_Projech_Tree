package net.kaczynski.drzewka;


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        try {
            System.out.println("Minimalna wartość: " + tree.min());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        tree.insert("D");
        tree.insert("B");
        tree.insert("F");
        tree.insert("A");
        tree.insert("C");
        tree.insert("E");
        tree.insert("G");

        System.out.println("Drzewo wypisane w porządku inorder:");
        tree.printInorder();

        System.out.println("Minimalna wartość: " + tree.min());
        System.out.println("Maksymalna wartość: " + tree.max());
    }
}