/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication172;

/**
 *
 * @author Mahboob
 */
class Node {
    
  int data;
Node next;  
    
}
public class JavaApplication172 {
     Node head;
        
        
      void insertat_end(int value){
          
          Node li= new Node();
          li.data= value;
          li.next= null;
        if( head==null){
            
            head= li;
        }else{
            Node temp= head;
            while( temp.next!=null){
               temp= temp.next;
                
            }
            temp.next= li;
            
        }
          
      }
       
       void display(){
           
           Node temp= head;
           while( temp!=null){
               
               System.out.println(temp.data);
               
              temp= temp.next;
               
           }
       }
       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JavaApplication172 nw= new JavaApplication172();
       
    nw.insertat_end(23);
    nw.insertat_end(67);
    nw.insertat_end(99);
    nw.display();
        // TODO code application logic here
        
       
    }
        
        
        
   
        
        
        
        
    }
    

