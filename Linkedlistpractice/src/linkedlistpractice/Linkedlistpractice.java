package linkedlistpractice;


 class Linkedlistpractice {
    Node head;   // this is the start of the linked list

    // insert at beginning
    void insertAtBeginning(int value) {
        Node newnode = new Node(value);
        newnode.next = head; // new node points to old head
        head = newnode;      // now head becomes new node
    }

    // display (for testing)
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlistpractice list = new Linkedlistpractice();

        // insert some values at beginning
        list.insertAtBeginning(26);
        list.insertAtBeginning(25);
        list.insertAtBeginning(24);

        // now display
        list.display(); // Output: 24 -> 25 -> 26 -> null
    }
}
