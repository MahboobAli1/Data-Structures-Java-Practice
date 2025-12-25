package queue_datastructure;

public class Queue_Datastructure {

    int size = 5;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;

    // ENQUEUE (insert element)
    public void enqueue( int value){
        
        if(isFull()){
            System.out.println(" list is full");
        
        
    }
        else{
            
           if( front==-1){
               
               
               front=0;
               rear++;
               arr[rear]= value;
               System.out.println(" value inserted in queue");
           }
        }
        
    }
    // DEQUEUE (remove element) with shifting
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY. Cannot dequeue.");
        } else {
            System.out.println(arr[0] + " removed from queue.");

            // Shift all elements one step to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--; // reduce rear position

            // If queue becomes empty after removal
            if (rear < 0) {
                front = -1;
            }
        }
    }

    // PEEK (view front element)
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY. No front element.");
        } else {
            System.out.println("Front element is: " + arr[0]);
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return front == -1;
    }

    // isFull
    public boolean isFull() {
        return rear == size - 1
                ;
    }

    // DISPLAY queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // MAIN method to test
    public static void main(String[] args) {
        Queue_Datastructure q = new Queue_Datastructure();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.peek();

        q.dequeue();
        q.display();

        q.enqueue(88);
        q.enqueue(99);
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue(); // underflow example

        q.enqueue(191);
        q.display();

        System.out.println("Is queue empty? " + q.isEmpty());
        System.out.println("Is queue full? " + q.isFull());
    }
}
