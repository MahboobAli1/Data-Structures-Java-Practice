/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_delete_specific;

/**
 *
 * @author Mahboob
 */
public class Array_Delete_specific {

    
    int arr[]={
        
        2,4,5,7
    };
    
    
    void remove( int index){
       
       
       for ( int i=0;i<index;i++){
           
           arr[i]= arr[i];
       }
       
       for ( int i= index;i<arr.length-1;i++){
           
          arr[i]= arr[i+1];
       }
        
    }
    
    void display(){
        System.out.println("arr is: ");
        for( int i=0;i<arr.length-1;i++){
            
            System.out.println(arr[i]);
        }
       
       
        for( int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Array_Delete_specific obj= new Array_Delete_specific();
        
        
        obj.remove(2);
      
       
        
        
      
    }
    
}
