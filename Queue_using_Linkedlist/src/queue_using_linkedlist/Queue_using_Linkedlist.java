/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue_using_linkedlist;

/**
 *
 * @author Mahboob
 */
class Node {
    
   int data;
   Node next;
    
    Node (int value){
        
        this.data= value;
        this.next= null;
        
    }
}


public class Queue_using_Linkedlist {
    Node front = null;
     Node rear = null;
    
    void add( int value){
        Node n= new  Node(value);
        if ( front==null){
            
          front= rear= n;
            
            
        }else {
            rear.next= n;
            rear= n;
            
        }
        
        System.out.println(" added"+value );
        
        
        
    }
    void remove(){
        
        if( isempty()){
            
            System.out.println(" Queue is empty");
            
        }else{
            
             System.out.println("remove "+ front.data); 
           front= front.next; 
            
            
           
        }
        
      
        
    }
    
     void peek(){
        
        
        if ( isempty())
             System.out.println(" Queue is empty");
        
         else {
    
            System.out.println(" first element is "+ front.data);
    
    
}
        
    } 
    
    void display(){
        Node temp= front;
         System.out.println("Queue elements:  ");
     while (temp!=null )   {
         
        
           System.out.println(temp.data);
           temp= temp.next;
         
     }
        
        
    }
    
   boolean isempty(){
       
       
       return front==null;
   }
    
    
    
    
    

    public static void main(String[] args) {
        
      
     Queue_using_Linkedlist obj= new Queue_using_Linkedlist();
     obj.add(22);
             obj.add(45);
             obj.remove();
             obj.add(56);
             
             obj.display();
        System.out.println(obj.isempty());      
    
        
        
        
    }
    
}
