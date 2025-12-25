/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_using_linkedlist;

/**
 *
 * @author Mahboob
 */

class Node {
    
    
    
    int data;
    Node next;
    
    Node (int data ){
        
       this.data= data;
       this.next= null;
        
    }
   
}
public class Stack_Using_linkedlist {
    
        Node head= null;
        
        
        boolean isempty(){
            
        
         return   head==null; 
            
            
        }
      void push( int value){
         
         Node n= new Node(value);
         if ( isempty()){
             head= n;
             System.out.println(" Pushed :"+ value);
         } else{
         n.next= head;
         head= n;
          System.out.println(" Pushed :"+ value);}
      }
      
      void traverse (){
           if (isempty()) {
            System.out.println("Stack  is empty.");
            return;
        }
          Node curr= head;
          System.out.println(" data is :");
          while ( curr!=null){
              
              System.out.println(curr.data); 
              
              curr= curr.next;
              
          }
          
          
          
      }
      void pop (){
          int top= head.data;
          if (isempty()) {
            System.out.println("Stack  is empty.");
            return; 
            
            
          
          
          
      }else{
              System.out.println(" poped: "+ head.data);    
         head= head.next;
         
              
          }
     
        
    
      
      }
      
      void peek( ){
          
        if ( isempty())  {
            
            System.out.println(" Stack is empty");
            
        }else{
            System.out.println("top is : "+ head.data);
            
        }
          
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        
      
        Stack_Using_linkedlist ob= new Stack_Using_linkedlist();
       
        ob.push(5);
                ob.push(7);
                ob.push(8);
        
        ob.pop();
       ob.traverse();
               ob.peek();
               ob.push(10);
               ob.push(23);
        ob.traverse();
        
      
        
        
    }
    
}
