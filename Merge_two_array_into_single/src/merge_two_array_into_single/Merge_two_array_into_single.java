/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merge_two_array_into_single;

/**
 *
 * @author Mahboob
 */
public class Merge_two_array_into_single {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int arr[]={ 1,2,3,5};
        
        int arr2[]={4,6,8,9};
        
        int arr3[]= new int [arr.length+arr2.length];
        
        for ( int i=0;i<arr.length;i++){
            
            arr3[i]= arr[i];
        }
        
     for ( int i=0;i<arr2.length;i++){
            
            arr3[arr.length+i]= arr2[i];
        }
        
        System.out.println(" Array is :");
       for ( int i=0;i<arr3.length;i++){
            
           System.out.println(arr3[i]);
        }  
    
    
}
}