/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication149;

/**
 *
 * @author Mahboob
 */
public class JavaApplication149 {
    
   static   int result=0;
    static int  sum( int num){
        
        if ( num<= 1){
            System.out.print(" "+num);
               return 1;}
            
       
     else {
            System.out.print(" "+num);
        return  num+ sum( num-1);
        }  
        
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(" sum: "+ sum(3));
            }
    
}
