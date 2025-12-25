/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci_series;

/**
 *
 * @author Mahboob
 */
public class Fibonacci_series {
    static int result=0;
   static  int fibo( int num){
        
        if ( num==1){
              
          return 1; }
          else if ( num==0){
            
          return 0; 
        }else {
          
          return  fibo(num- 1) + fibo(num - 2); 
          
        }
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 6; // Number of terms you want to print
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
    }
    
}}
