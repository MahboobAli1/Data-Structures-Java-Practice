/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_lab_2_t4;

/**
 *
 * @author Mahboob
 */
import java.util.Scanner;
public class DSA_Lab_2_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num[]= {3,5,7,8,9};
        Scanner read=new Scanner( System.in);
        System.out.println(" Array before delete:");
        for (int i=0;i<num.length;i++){
            System.out.print(" "+num[i]);
            
        }
        System.out.println(" Enter element to delete");
       
        int d_ele= read.nextInt();
        
        for ( int i=0,j=0;i<num.length;i++){
            if ( num[i]==d_ele) continue;
            else{
                num[j]= num[i];
                j++;
            }}
              for ( int i=0;i<num.length;i++){
               System.out.print(" "+num[i]); }
                 
        }
           
        
    }
    

