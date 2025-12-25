/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_dsa;

/**
 *
 * @author Mahboob
 */
import java.util.Scanner;
public class Lab1_DSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner( System.in);
        
        System.out.println(" Enter size of array :");
        
        int size= read.nextInt();
        int arr[]= new int [size];
        System.out.println(" Enter elements in array:");
        for ( int i=0;i<arr.length;i++){
            
            arr[i]= read.nextInt();
        }
        
        System.out.println(" Enter number of operation you want to perform"
                + " \n1: insert Element in array:"
                + "\n2; Remove element fron array: "
                + "\n3:Search element in array :"
                + "\n4:find max number in array: "
                + "\n5:find min number in array:"
                + "\n6:find common numbers in two arrays :"
                + "\n7: find product of numbers in array: "
                + " \n8:Find average of numbers in array :"
                + "\n 9:Find reverse of array : "
                + "\n10: Find distinct numbers in array :"
                + "\n11:Replace a number in array: "
                + "\n12:Find even numbers in array: "
                + "\n13:Find odd numbers in array:"
                + "\n14:Find prime numbers in array:");
        
        int choice= read.nextInt();
        
        
        switch ( choice){
            case 1:
             
                System.out.println("Enter position at which element be inserted: ");      
                int posit= read.nextInt();
                System.out.println(" Enter element you want to insert:");
                int element= read.nextInt();
                 int newarr[]= new int [arr.length+1];
                for ( int i=0,j=0;i<newarr.length;i++){
                    
                   if ( posit==i) newarr[i]= element;
                   else{
                       
                      newarr[i]= arr[j];
                              j++;
                   }
                }
                System.out.println(" New array is :");
                for ( int i=0,j=0;i<newarr.length;i++)
                {
                    System.out.print(newarr[i]+" ");  
                    
                }
            break;
        
               case 2:
                   System.out.println(" enter element  you want to remove ");
                   int rem_ele= read.nextInt();
               int rem_arr[]= new int[arr.length-1];  
               
               for( int i=0,j=0; i<arr.length;i++){
                   
                   if (rem_ele==arr[i])continue;
                   else{
                       rem_arr[j]= arr[i];
                       j++;
                       
                   }
                   
               }
                   
                System.out.println(" after removing element ,New array is :"); 
                     for( int i=0,j=0; i<rem_arr.length;i++)
                     {
                         System.out.print(rem_arr[i]+" ");
                     }
                     break;
               case 3:
                   
                   System.out.println(" Enter element you want to search"); 
                   int search_ele= read.nextInt();
                   
                   for ( int i=0;i<arr.length;i++)
                   {
                       
                       if ( search_ele==arr[i]){
                           
                           System.out.println(" element found at index:"+ i);
                       }
                       
                   }
                   break;
               case 4:
                   int max= arr[0];
                   for( int i=0;i<arr.length;i++){
                       
                       if ( max<arr[i])
                           max=arr[i];
                   }
                   System.out.println(" Max element in array is :"+ max);
                   break;
               case 5:
                   int min= arr[0];
                   for ( int i=0;i<arr.length;i++){
                       
                       if ( min>arr[i])
                           min=arr[i];
                   }
                   System.out.println(" Min element in array is : "+ min);
                   break;
               case 6:
                   System.out.println("Enter element for new arr:");
                   int secarr[]= new int [size];
                   for ( int i=0;i<secarr.length;i++){
                       
                       secarr[i]= read.nextInt();
                       
                   }
                   
                   for ( int i=0;i<arr.length;i++){
                       
                       
                       for ( int j=0;j<secarr.length;j++){
                           
                         if(arr[i]==secarr[j]){
                             System.out.println("Common numbers are:"+arr[i]); 
                         }  
                       }
                   }
                   break;
               case 7:
                   
                   int product=1;
                   for ( int i=0;i<arr.length;i++){
                       
                       product*=arr[i];
                   }
                   System.out.println(" Product of numbers in array is :"+ product);
                   break;
               case 8:
                   int total=0;
                 for ( int i=0;i<arr.length;i++){
                       
                      total+=arr[i];
                   } 
                   System.out.println("Average of numbers in array is :  "+total/size );
                   break;
               case 9:
                   System.out.println(" Reverse of array is :"); 
                   
                   for(int i=0;i<arr.length/2;i++)
                   { 
                    int temp=arr[i];
                    arr[i]=arr[arr.length-1-i];
                       arr[arr.length-1-i]=temp;
                   }
                    for(int i=0;i<arr.length;i++ )
                   { System.out.print(arr[i]+" ");
                       
                   }
                    break;
              
                   case 10:
    System.out.println("Distinct numbers in array are:");
    for (int i = 0; i < arr.length; i++) {
        boolean seenBefore = false;
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                seenBefore = true;
                break;
            }
        }
        if (!seenBefore) {
            System.out.print(arr[i] + " ");
        }
    }
  
    break;
          
                   case 11:
                       System.out.println("Enter numbers to replace : ");
                       for ( int i=0;i<arr.length;i++){
                           arr[i]= read.nextInt();
                           
                       }
                       System.out.println(" now array is :");
                       for ( int i=0;i<arr.length;i++)
                       {
                           
                           System.out.println(arr[i]+" ");
                       }
                       break;
                        case 12:
                            System.out.println(" Even numbers in array are:");
                            for ( int i=0 ; i<arr.length;i++){
                                
                                if ( arr[i]%2==0)
                                {   
                                    System.out.println(arr[i]+" ");
                                    
                                }
                            }
                            break;
                            case 13:
                            System.out.println(" Odd numbers in array are:");
                            for ( int i=0 ; i<arr.length;i++){
                                
                                if ( arr[i]%2!=0)
                                {   
                                    System.out.println(arr[i]+" ");
                                    
                                }
                            }
                            break;
                            case 14:
                                
                           System.out.println(" Prime numbers in array are:");
                            for ( int i=0 ; i<arr.length;i++){
                                int num_of_div=1;
                                if(arr[i]%2==0)
                                {
                                    num_of_div++;
                                   
                                }
                                 if(arr[i]%3==0)
                                         num_of_div++;
                               
                                if (num_of_div==1 )
                                {   
                                    System.out.println(arr[i]+" ");
                                    
                                }
                            }
                            break; 
                   
        }
     
        
            
    }
    
}
