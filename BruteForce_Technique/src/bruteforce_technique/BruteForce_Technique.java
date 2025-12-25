package bruteforce_technique;

import java.util.Scanner;

public class BruteForce_Technique {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // Step 1: Create and fill array
        int[] arr = new int[5];
        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }

        // Step 2: Enter target sum
        System.out.print("Enter the target sum: ");
        int target = read.nextInt();

        // Step 3: Brute Force to find the pair
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {  // j starts from i+1 to avoid repeating same pairs
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found with target sum " + target);
        }

       
    }
}
