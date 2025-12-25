/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum_average_array;

/**
 *
 * @author Mahboob
 */
import java.util.Scanner;
public class Sum_average_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" enter the size of array");
        
        Scanner read = new Scanner ( System.in);
        
        int size= read.nextInt();
        int sum=0;
        int average=0;
        
        int arr[]= new int [size];
        System.out.println(" Enter the elements of array");
        for ( int i=0;i<size;i++){
            
         arr[i]= read.nextInt();
        }
        System.out.println(" Enter elemnt to search");
      int num=  read.nextInt();
      int index=0;
        
        for ( int i=0;i<size;i++ ){
            
            
           sum+= arr[i];
           if ( num==arr[i])
           {
             
               System.out.println(" Number found at index :"+ i);
               
           }
            
            
        }
        
        System.out.println(" Sum is : "+ sum);
        System.out.println(" Average :"+ sum/arr.length);
        
    }
    
}
