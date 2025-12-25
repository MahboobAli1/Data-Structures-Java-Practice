/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_lab_p;

/**
 *
 * @author Mahboob
 */

class Node{
    
    int data;
    Node left;
      Node right;
      
      Node(int value){
        left=right= null;
        this.data= value;
          
          
      }
    
    void preorder(){
        
        System.out.println(data);  
        if(left!= null)
            left.preorder();
        if(right!=null)
            right.preorder();
        
    }
    
   void inorder(){
       
       if(left!=null)
           left.inorder();
       System.out.println(data);
       if( right!=null)
           right.inorder();
       
       
   }
   void postorder(){
       
     if ( left!=null)
     left.postorder();
     if(right!=null)
         right.postorder();
       System.out.println(data);
       
       
   }
    
}
public class Final_lab_p {
    Node root;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
     Node n= new Node(4);
     n.left= new Node(8);
     n.right= new Node (10);
     n.right.right= new Node ( 6);
        System.out.println("PRE ORDER");
        n.preorder();
        System.out.println("inoder");
        n.inorder();
        System.out.println("post order");
        n.postorder();
        
        // TODO code application logic here
    }
    
}
