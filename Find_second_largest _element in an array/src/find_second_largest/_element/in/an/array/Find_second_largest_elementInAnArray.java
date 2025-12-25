/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package find_second_largest._element.in.an.array;

/**
 *
 * @author Mahboob
 */
public class Find_second_largest_elementInAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
   
        int arr[] = {13, 4, 8, 34, 22};

        int max = Integer.MIN_VALUE;
        int Sec_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // New max found, push old max to second max
                Sec_max = max;
                max = arr[i];
            } else if (arr[i] > Sec_max && arr[i] != max) {
                // Update second max only if it's not equal to max
                Sec_max = arr[i];
            }
        }

        if (Sec_max == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found.");
        } else {
            System.out.println("Second largest element: " + Sec_max);
        }
    }
}
