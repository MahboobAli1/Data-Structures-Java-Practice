package javaapplication162;

public class JavaApplication162 {
    public static void main(String[] args) {
        int arr[] = new int[10];   // array with extra space
       
       for ( int i=0;i<arr.length;i++){
           arr[i]=i;
           
       }
       
       
       int ele= 5;
       for ( int i=0,j=0;i<arr.length;i++){
           
           if ( ele==arr[i]){
               continue;
           }else{
               
            arr[j]= arr[i];
            j++;
           }
           
         
      
       }
         for ( int i=0;i<arr.length;i++){
               
               System.out.print(""+ arr[i]);
           }
    }
}
