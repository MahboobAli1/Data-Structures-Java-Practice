package dsa_lab_2_t3;

import java.util.Scanner;

public class DSA_Lab_2_T3 {

    public static void main(String[] args) {
      
        Scanner read= new Scanner( System.in);
        
        
        int arr[]= { 2,5,6,7,8,11};
        System.out.println(" Array before insetion");
        for ( int i=0;i<arr.length;i++){
            
            System.out.print(" "+arr[i]);  
            
        }
        System.out.println(" Enter element to insert: ");
        
        int ele= read.nextInt();
                System.out.println(" Enter postion, element to  be inserted: ");
        int pos= read.nextInt();
        
        int newarr[]=new int [arr.length+1];
        
        for ( int i=0,j=0;i<newarr.length;i++){
         if ( pos==i){
             newarr[i]= ele;
         }else{
             newarr[i]= arr[j];
             j++;
         }
            
            
        }
        System.out.println(" New array is : ");
        for ( int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);  
            
        }
        
    }
}
