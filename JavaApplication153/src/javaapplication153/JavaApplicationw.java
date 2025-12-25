/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication153;

/**
 *
 * @author Mahboob
 */


class Node  {

   
        
        

// Node class (single node of the tree)

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

// BinaryTree class (main logic)
public class Node {
    Node root;

    // Method to manually build a simple binary tree
    public void buildTree() {
        root = new Node(1);              // Root node
        root.left = new Node(2);         // Left child of 1
        root.right = new Node(3);        // Right child of 1
        root.left.left = new Node(4);    // Left child of 2
        root.left.right = new Node(5);   // Right child of 2
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

    // Main method
    public static void main(String[] args) {
        Node tree = new Node();
        tree.buildTree();

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);  // Output: 1 2 4 5 3

        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);   // Output: 4 2 5 1 3

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root); // Output: 4 5 2 3 1
    }
}

   