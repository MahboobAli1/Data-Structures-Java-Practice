/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_.mid_practice;

/**
 *
 * @author Mahboob
 */
public class Array_Mid_Practice {
    
    int arr[]= {2,3,5,6};   
  
   
    
    
 
    void display(){
        
        System.out.println(" elements");  
        
        for( int i=0;i<arr.length;i++){
            
          System.out.print(arr[i]+" ");   
            
            
        }
       
        
   
    }


void  linear_search(int value){
    
    boolean found= false;
    for( int i=0;i<arr.length;i++){
        
        if ( value==arr[i]){
            
            System.out.println( "found");
            found = true;
            return;
        }
        
    }
    if(!found){
        System.out.println(value+"not found");
    }
        
    }


void binary_search(int target ){
    
    
int start= 0; 
int end= arr.length-1;
    
     while(start<= end){
         
         int mid= (start+end)/2;
         
         
         if(arr[mid]==target){
             
             System.out.println("found");
             return;
         }
         else if( arr[mid]<target){
             
             start= mid+1;
             
         } else{
             
             
             end= mid-1;
         }
         
     }
     
     System.out.println("not found");
}

void bubble(){
    
    for( int i=0;i<arr.length-1;i++){
        
       for( int j=0;j<arr.length-1;j++){
           
           
          if( arr[j]>arr[j+1]) {
              
             int temp= arr[j];
             arr[j]= arr[j+1];
             arr[j+1]= temp;
              
          }
       } 
        
        
    }
    
}
void insert(int value){
   
    
    int newarr[]= new int [arr.length+1];
    
    newarr[0]= value;
    
    for( int i=0;i<newarr.length-1;i++){
        
        newarr[i+1]= arr[i];
        
    }
    System.out.println("Inseted"+ value);
    
}
        
        
   
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array_Mid_Practice ob= new Array_Mid_Practice();
        
        ob.display();
       ob.insert(6);
        
        ob.insert(9);
        ob.display();
        
        
       
        
    }
    
}
