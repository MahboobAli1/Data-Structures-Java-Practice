

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Mahboob
 */
/*
 * Complete Implementation of Singly Linked List in Java
 * Covers:
 * 1. Insert at first
 * 2. Delete from first
 * 3. Display list
 * 4. Insert at last
 * 5. Delete from last
 * 6. Insert at middle (specific position)
 * 7. Delete from middle (specific position)
 * 8. Reverse the list
 * 9. Find Max
 * 10. Find Min
 * 11. Search data position
 */

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
  private  Node head;

    // 1️⃣ Insert at first position
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2️⃣ Delete from first position
    public void deleteFromFirst() {
        
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // 3️⃣ Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 4️⃣ Insert at last position
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 5️⃣ Delete from last position (Fixed - same style)
public void deleteFromLast() {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    if (head.next == null) { // only one node
        head = null;
        return;
    }
 Node Slast = head;
    Node last = head.next;  // second node
         // first node

    while (last.next != null) {  // stop at last node
        last = last.next;
        Slast = Slast.next;
    }

    Slast.next = null;  // remove last node
}

    // 6️⃣ Insert at middle (specific position)
    public void insertAtPosition(int data, int pos) {
        if (pos <= 1) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 7️⃣ Delete from middle (specific position)
    public void deleteFromPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (pos == 1) {
            deleteFromFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range.");
            return;
        }
        temp.next = temp.next.next;
    }

    // 8️⃣ Reverse the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // 9️⃣ Find max
    public int findMax() {
        if (head == null) throw new RuntimeException("List is empty.");
        int max = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data > max) max = temp.data;
            temp = temp.next;
        }
        return max;
    }

    // 🔟 Find min
    public int findMin() {
        if (head == null) throw new RuntimeException("List is empty.");
        int min = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data < min) min = temp.data;
            temp = temp.next;
        }
        return min;
    }

    // 1️⃣1️⃣ Search position of data
    public int search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) return pos;
            temp = temp.next;
            pos++;
        }
        return -1; // not found
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at first");
            System.out.println("2. Delete from first");
            System.out.println("3. Display");
            System.out.println("4. Insert at last");
            System.out.println("5. Delete from last");
            System.out.println("6. Insert at position");
            System.out.println("7. Delete from position");
            System.out.println("8. Reverse");
            System.out.println("9. Find Max");
            System.out.println("10. Find Min");
            System.out.println("11. Search");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtFirst(sc.nextInt());
                    break;
                case 2:
                    list.deleteFromFirst();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.print("Enter value: ");
                    list.insertAtLast(sc.nextInt());
                    break;
                case 5:
                    list.deleteFromLast();
                    break;
                case 6:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    break;
                case 7:
                    System.out.print("Enter position: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;
                case 8:
                    list.reverse();
                    break;
                case 9:
                    System.out.println("Max: " + list.findMax());
                    break;
                case 10:
                    System.out.println("Min: " + list.findMin());
                    break;
                case 11:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    int position = list.search(key);
                    if (position == -1) System.out.println("Not found.");
                    else System.out.println("Found at position: " + position);
                    break;
                case 12:
                    System.out.println("Exiting...");
                    
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

