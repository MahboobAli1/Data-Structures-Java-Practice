package insertion.sort_new;



/**
 *
 * @author Mahboob
 */
public class InsertionSort_new {
    
   
    
}
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

 int arr[]= {
        2,5,3,7,6
    };
    
    int temp,j;
 for (int i= 0;i<arr.length;i++){
    
    temp= arr[i];
    j=i;
    while(j>0&& arr[j-1]>temp)
    {
      arr[j]  =arr[j-1];
      j=j-1;
    }
    
    arr[j]=temp;
    }
for( int x:arr){

    System.out.println(x);
}
    
}
