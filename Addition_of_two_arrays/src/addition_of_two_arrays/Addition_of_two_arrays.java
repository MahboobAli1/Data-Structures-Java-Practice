/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition_of_two_arrays;

/**
 *
 * @author Mahboob
 */
import java.util.Scanner;
public class Addition_of_two_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner scan= new Scanner( System.in);  
      
        System.out.println(" enter rows for array");
        int row1= scan.nextInt();
         System.out.println(" enter column for array:");
         int col1= scan.nextInt();
         int arr[][]= new int[row1][col1];
         System.out.println(" Enter elements in array:");
         for ( int i=0;i<row1;i++){
             
          for ( int j=0;j<col1;j++){
              
              arr[i][j]= scan.nextInt();
          }   
             
         }
         
    
         System.out.println(" enter rows for array 2");
        int row2= scan.nextInt();
         System.out.println(" enter column for array:");
         int col2= scan.nextInt();
         int arr2[][]= new int[row2][col2];
         System.out.println(" Enter elements in array:");
         for ( int i=0;i<row2;i++){
             
          for ( int j=0;j<col2;j++){
              
              arr2[i][j]= scan.nextInt();
          }   
             
         }
          if (row1 != row2 || col1 != col2) {
    System.out.println("Arrays must have the same dimensions to add.");
    return; // stop program
}
            int   arr3[][]= new int[row1][col1];
         
          System.out.println("  array is :");
   for ( int i=0;i<row1;i++){
       
       for ( int j=0;j<col1;j++){
           System.out.print(arr[i][j]+"  ");
       } 
   }
    
          System.out.println("  array is :");
   for ( int i=0;i<row2;i++){
       
       for ( int j=0;j<col2;j++){
           System.out.print(arr2[i][j]+"  ");
       } 
   }
       
        for ( int i=0;i<row2;i++){
       
       for ( int j=0;j<col2;j++){
         arr3[i][j]= arr[i][j]+arr2[i][j];  
       } 
   }
        System.out.println("new array is ;");   
      for ( int i=0;i<row2;i++){
       
       for ( int j=0;j<col2;j++){
           System.out.print(arr3[i][j]+ " ");  
       } 
          System.out.println();
   }   
        
        
    }
    
}
