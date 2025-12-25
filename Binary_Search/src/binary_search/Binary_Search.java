/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary_search;

/**
 *
 * @author Mahboob
 */
public class Binary_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
    int     arr[]= {2,4,6,9,11};
        
      int target=6;
    int low= 0;
    int heigh= arr.length-1;
    while(low<=heigh)
    {
       int mid= (low+heigh)/2;
        if(arr[mid]==target )
        {
            System.out.println(" target found"+ " at index"+ mid );  
            break;
        }
        else if(arr[mid]<target){
            
          low= mid+1;
        } else{
           heigh= mid-1; 
        }
       
    }
    
   
    
        
        
    }
    
}
