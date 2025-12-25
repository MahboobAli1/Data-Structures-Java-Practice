/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package two_pointer_technique;

import java.util.Scanner;

/**
 *
 * @author Mahboob
 */
public class Two_pointer_Technique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        // Two pointer logic
        int left = 0;
        int right = n - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break;
            } else if (sum < target) {
                left++;  // Increase to get a bigger sum
            } else {
                right--; // Decrease to get a smaller sum
            }
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }


    }
    
}
