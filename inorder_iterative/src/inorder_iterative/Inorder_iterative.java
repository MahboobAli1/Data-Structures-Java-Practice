package inorder_iterative;

// Node class
class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Inorder_iterative {

    static void process(int x) {
        System.out.print(x + " ");
    }

    public static void iterativeInorder(Node root) {
        if (root == null) return;

        Node[] stack = new Node[100];
        int TOP = 0;
        Node PTR = root;

        // Push left-most path
        while (PTR != null) {
            stack[TOP++] = PTR;
            PTR = PTR.left;
        }

        while (TOP > 0) {
            PTR = stack[--TOP]; // pop
            process(PTR.data);

            // If right child exists, push its left-most path
            PTR = PTR.right;
            while (PTR != null) {
                stack[TOP++] = PTR;
                PTR = PTR.left;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Iterative Inorder Traversal:");
        iterativeInorder(root);
    }
}
