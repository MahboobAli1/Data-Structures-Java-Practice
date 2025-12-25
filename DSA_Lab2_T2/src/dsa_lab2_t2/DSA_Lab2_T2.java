package dsa_lab2_t2;

import java.util.Scanner;

public class DSA_Lab2_T2 {
    public static void main(String[] args) {
        
        int numbers[] = {4, 5, 6, 9, 11, 45, 67, 88, 100};
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = read.nextInt();
        
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;  
        int comparisons = 0;  
        
        while (low <= high) {
            int mid = (low + high) / 2;   
            comparisons++;
            
            if (numbers[mid] == target) {
                System.out.println("Element found at index " + mid);
                System.out.println("Comparisons made: " + comparisons);
                found = true;
                break;
            } 
            else if (numbers[mid] < target) {
                low = mid + 1;   
            } 
            else {
                high = mid - 1; 
            }
        }
        
        if (!found) {
            System.out.println("Element not found in the array.");
            System.out.println("Comparisons made: " + comparisons);
        }
    }
}
