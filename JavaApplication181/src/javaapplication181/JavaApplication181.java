/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication181;

/**
 *
 * @author Mahboob
 */

 class STK{
    
    int Stack[]=new int[10];
    
    int top=-1;
    public void push(int item){
        
        if(top==Stack.length-1){
            
            System.out.println(" ovrerflow");
            
            
        }else{
            
          top= top+1;
          Stack[top]= item;
            
        }
        
        
    }
    
    public void pop(){
        
        
        if( top==-1){
            
            
            
            System.out.println("underflow");
        }else{
            
            System.out.println("poped:"+ Stack[top]);
            top= top-1;
        }
        
    }
  
    
    public void traverse(){
        
        System.out.println("items");
        
        for( int i=0;i<=top;i++){
            
            
            System.out.println( Stack[i]);
        }
    }
    
    
    public void peek(){
        
       if ( top==-1) {
           
           
           System.out.println(" Underflow");
       }else{
           
           System.out.println("  top element: "+ Stack[top]); 
           
           
       }
        
        
    }
    boolean isempty(){
         return top==-1 ;
       
    }
    boolean isFull(){
        
        return top==Stack.length-1;
        
    }
    
    
}
public class JavaApplication181 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        STK obj= new STK();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.traverse();
        
        obj.peek();
        
        obj.pop();
        obj.traverse();
        System.out.println("is empty:"+obj.isempty());
           System.out.println("is full:"+obj.isFull());
    }
    
}
