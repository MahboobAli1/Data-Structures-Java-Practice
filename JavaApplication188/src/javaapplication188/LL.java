/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication188;

/**
 *
 * @author Mahboob
 */
public class LL {
    private Node first=null;
    private Node last;
    
    
    public void insert(int a){
        Node current =new Node(); 
        current.data=a;
       if(first==null){
       first=current;
       last=current;
       current.next=null;
       return;
       }

    
    current.next=first;
    first=current;
  
    
    }
    public void delet(){
    Node temp=first;
    
    while(temp.next!=null){
    temp=temp.next;}
   
    last.next=null;
    
    
    
    
    
    }
    
    public void display(){
    Node temp=first;
    while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
    }
    }
}
