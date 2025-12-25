/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package min_max_element.pkg_.in.array;

/**
 *
 * @author Mahboob
 */
public class Min_Max_element_InArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        
        int arr[]={1,3,6,99,45,2};
         int min=arr[0];
         int max=arr[0];
        for ( int i=0;i<arr.length;i++)
        { 
         
            
            if ( min>=arr[i])
            {
                min= arr[i];
            }
             if ( max<=arr[i])
            {
                max= arr[i];
            }
             
            
            
        }
        
         System.out.println(" max "+ max+" min"+min);
        
        // TODO code application logic here
    }
    
}
