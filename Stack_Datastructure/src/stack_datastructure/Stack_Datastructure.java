 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_datastructure;

/**
 *
 * @author Mahboob
 */
public class Stack_Datastructure {

    int arr[] = new int[5];  // stack array
    int size = 5;            // capacity
    int top = -1;            // top pointer (starts from -1 when empty)

    // PUSH operation
    public void push(int value) {
        if (top >= size - 1) {     // condition for full stack
            System.out.println("Stack is FULL. Cannot push " + value);
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed.");
        }
    }

    // POP operation
    public void pop() {
        if (top == -1) {           // stack empty condition
            System.out.println("Stack is EMPTY. Nothing to pop.");
        } else {
            System.out.println(arr[top] + " popped.");
            top--;
        }
    }

    // PEEK operation (top element)
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is EMPTY. No top element.");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }

    // isEmpty operation
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull operation
    public boolean isFull() {
        return top == size - 1;
    }

    // DISPLAY all elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is EMPTY.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {  // display from top to bottom
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
        }
    }
    
    void max(){
       int max= arr[0]; 
        for ( int i=0;i<=top;i++){
            if( arr[i]>max){
                max= arr[i];
            }
           
            
            
        }
        
        System.out.println(" Max"+ max); 
    }

    // MAIN method to test all operations
    public static void main(String[] args) {
        Stack_Datastructure s = new Stack_Datastructure();

        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
     
        s.display();

        s.peek();

        s.pop();
        s.display();

        s.pop(); // will show underflow message
s.max();
        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println("Is stack full? " + s.isFull());
    }
}
