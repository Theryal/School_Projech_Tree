package net.kaczynski.drzewka;

import com.sun.java.util.jar.pack.ConstantPool;

public class Tree {
    Node root;
    private boolean current;

    public Tree() {
        this.root = null;
    }



    public void insert(String value) {
        root = insertRecursive(root, value);
    }
    private Node insertRecursive(Node current, String value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.compareTo(current.value) < 0) {
            current.left = insertRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }


    public void printInorder() {
        printInorderRecursive(root);
    }
    private void printInorderRecursive(Node node) {
        if (node != null) {
            printInorderRecursive(node.left);
            System.out.print(node.value + " ");
            printInorderRecursive(node.right);
        }

    }
    public void printAscending() {
        printAscendingRecursive(root);
    }
    private void printAscendingRecursive(Node node) {
        if (node != null) {
            printAscendingRecursive(node.left);
            System.out.print(node.value + " ");
            printAscendingRecursive(node.right);
        }
    }
    public void printDescending() {
        printDescendingRecursive(root);
    }
    private void printDescendingRecursive(Node node) {
        if (node != null) {
            printDescendingRecursive(node.right);
            System.out.print(node.value + " ");
            printDescendingRecursive(node.left);
        }
        
        
        public void delete(String ConstantPool.Entry value;
        value) {    
            try {
                root = deleteRecursive(root, value);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Metoda rekurencyjna do usuwania elementu z drzewa z obsługą błędu przy usuwaniu nieistniejącego elementu
        private Node deleteRecursive(Node
        current, String value) {
            if (current == null) {
                throw new IllegalArgumentException("Element does not exist in the tree: " + value);
            }

            if (value.compareTo(current.value) < 0) {
                current.left = deleteRecursive(current.left, value);
            } else if (value.compareTo(current.value) > 0) {
                current.right = deleteRecursive(current.right, value);
            } else {
                // Przypadek, gdy znaleziono element do usunięcia

                // Przypadek 1: Brak potomków lub tylko jeden potomek
                if (current.left == null) {
                    return current.right;
                } else if (current.right == null) {
                    return current.left;
                }

                // Przypadek 2: Dwa potomki
                // Znajdź najmniejszy element w prawym poddrzewie (następnik) lub największy element w lewym poddrzewie (poprzednik)
                // i zastąp wartość bieżącego węzła wartością następnika/poprzednika
                current.value = findMinValue(current.right);

                // Usuń następnik/poprzednik z prawego poddrzewa
                current.right = deleteRecursive(current.right, current.value);
            }

            return current;
        }

        // Metoda pomocnicza do znajdowania najmniejszej wartości w drzewie
        private String findMinValue(Node node) {
            String minValue = node.value;
            while (node.left != null) {
                minValue = node.left.value;
                node = node.left;
            }
            return minValue;

            public String min() {
                if (root == null) {
                    throw new IllegalStateException("Tree is empty");
                }

                Node current = root;
                while (current.left != null) {
                    current = current.left;
                }

                return current.value;
            }

            // Metoda do znalezienia maksymalnej wartości w drzewie
            public String max() {
                if (root == null) {
                    throw new IllegalStateException("Tree is empty");
                }

                Node current = root;
                while (current.right != null) {
                    current = current.right;
                }

                return current.value;
            }
        }
    }

    private Node deleteRecursive(Node root, ConstantPool.Entry value) {
    }

    public String min() {
    }

    public String max() {
    }
}
}
