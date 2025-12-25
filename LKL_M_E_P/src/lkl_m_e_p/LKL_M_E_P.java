/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lkl_m_e_p;

/**
 *
 * @author Mahboob
 */

class Node {
    
    int data;
    Node next;
    Node(){
        
      int data= this.data;
      this.next= null;
        
    }
    
}
public class LKL_M_E_P {
    Node head;
void insertlast(int value){
      Node n= new Node();
      n.data= value;
      n.next= null;
    if ( head==null){
       head= n; 
       
    }
    else{
        Node temp= head;
        while( temp.next!=null){
           
           temp= temp.next;
           
          
           
           
        }temp.next= n; 
        
        
    }
    
    
    
}



void display(){
    
 Node temp= head;
        while( temp!=null){
            System.out.println(temp.data);
           temp= temp.next;
          
           
}}
 public void deleteFromPosition(int pos) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }
    if (pos == 1) {
        head = head.next;  // ✅ fix: only remove first node
        System.out.println("Node deleted from position " + pos);
        return;
    }
    Node temp = head;
    for (int i = 1; i < pos - 1 && temp.next != null; i++) {
        temp = temp.next;
    }
    if (temp == null || temp.next == null) {
        System.out.println("Position out of range.");
        return;
    }
    temp.next = temp.next.next;
    System.out.println("Node deleted from position " + pos);
}
 
 void reverse(){
     
     
     if ( head==null|| head.next==null){
         
         return;
     }
     Node prev= head;
     Node curr= head.next;
     
     while(curr!= null ){
         
       Node next= curr.next;
       curr.next= prev;
       
       
       prev= curr;
       curr= next;
         
         
     }
     head.next= null;
     head= prev;
     
 }
 void min(){
     
     Node curr= head;
      int max= curr.data;
      int pos= 0;
     while( curr!= null){
        
         pos++;
         if (curr.data>max ) max= curr.data;
         
         curr= curr.next;
     }
     
     System.out.println("max"+ max+ "at pos"+pos);
     
     
 }
 
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        LKL_M_E_P l= new LKL_M_E_P();
        l.insertlast(9);
l.insertlast(88);
l.insertlast(112);
l.insertlast(122);  

    l.display();
    l.min();
    }
    
}
