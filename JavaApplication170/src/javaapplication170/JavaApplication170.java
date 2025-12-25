package javaapplication170;

class Node {
    int data;
    Node next;
}

public class JavaApplication170 {
    Node head;

   // Insert at end
void insert_last(int value) {
    Node newnode = new Node();   // step 1: create a new node
    newnode.data = value;        // step 2: put value
    newnode.next = null;         // step 3: last node always points to null

    if (head == null) {          // case 1: list is empty
        head = newnode;          // new node becomes head
    } else {                     // case 2: list has elements
        Node temp = head;        // start from head
        while (temp.next != null) { // traverse until last node
            temp = temp.next;
        }
        temp.next = newnode;     // link last node to new node
    }
}


    // Display linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        JavaApplication170 n1 = new JavaApplication170();

        // insert some nodes at beginning
        n1.insert_last(2);
        n1.insert_last(3);
        n1.insert_last(55);

        // display the list
        n1.display();  // Output: 6 -> 5 -> 4 -> null
    }
}
