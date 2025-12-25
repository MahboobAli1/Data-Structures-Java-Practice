/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package check_if_array_ispalindrome;

/**
 *
 * @author Mahboob
 */
public class Check_if_array_Ispalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr[]={ 11,22,22,11,22,77};
        
        boolean is_palindrome = true;
        for ( int i=0;i<arr.length/2;i++){
            
            
            
            if ( arr[i]!=arr[arr.length-i-1]){
                
               is_palindrome = false;
               break;
            }
        }
       if (is_palindrome ){
       System.out.println(" Array is palindrome");
       }else {
           
          System.out.println(" Array is not palindrome"); 
       }
         
       
        // TODO code application logic here
    }
    
}
