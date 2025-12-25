/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tree_traversals;

/**
 *
 * @author Mahboob
 */

class Node {
  
    int data;
    Node left;
    Node right;
    Node (int value){
        
        data= value;
        left= right= null;
        
        
    }
    void preoder(){
    
    
    
    System.out.println(data);
    if(left!= null)
    {left.preoder();
        
        
    }
    if ( right!= null)
        right.preoder();
        
}
    
    void inorder(){
        
        if ( left!= null)left.inorder();
        System.out.println(data);
        if ( right!= null)
            right.inorder();
        
        
    }
    void postoder(){
        
        
        if ( left!= null)
            left.postoder();
        if ( right!= null)
            right.postoder();
        System.out.println(data);
        
    }
    
}
public class Tree_traversals {

Node root;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 
  

        // TODO code application logic here
        
         
       Tree_traversals obj= new Tree_traversals();
       obj.root= new Node(1);
       
       obj.root.left= new Node(3);
       obj.root.right= new Node(8);
       
       obj.root.preoder();
          
        
    }
    
}
