// This is the class representing a single node in the tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize node with data
    public Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

// This class represents the Binary Tree itself
class BinaryTree {
    Node root;

    // Method to manually build a simple binary tree
    public void buildTree() {
        // Creating nodes and linking them
        root = new Node(1);              // Root node
        root.left = new Node(2);         // Left child of 1
        root.right = new Node(3);        // Right child of 1
        root.left.left = new Node(4);    // Left child of 2
        root.left.right = new Node(5);   // Right child of 2
        // Tree looks like this now:
        /*
                 1
               /   \
              2     3
             / \
            4   5
        */
    }

    // Preorder Traversal: Root → Left → Right
    public void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal: Left → Root → Right
    public void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal: Left → Right → Root
    public void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Main method to run your code
    public static void main(String[] args) {
        // Create BinaryTree object
        BinaryTree tree = new BinaryTree();

        // Build tree manually
        tree.buildTree();

        // Run different traversals
        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);  // Output: 1 2 4 5 3

        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);   // Output: 4 2 5 1 3

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root); // Output: 4 5 2 3 1
    }
}
