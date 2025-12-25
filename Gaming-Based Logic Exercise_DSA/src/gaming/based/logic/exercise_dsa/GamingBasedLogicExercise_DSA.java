/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gaming.based.logic.exercise_dsa;
import java.util.Scanner;
/**
 *
 * @author Mahboob
 */
public class GamingBasedLogicExercise_DSA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose Operation:");
        System.out.println("1. Find Highest Score");
        System.out.println("2. Find Lowest Score");
        System.out.println("3. Calculate Total Points");
        System.out.println("4. Reverse Player Turn Order");
        System.out.println("5. Search for a Players Score");
        System.out.println("6. Calculate Average Score");
        System.out.println("7. Count Even and Odd Scores");
        System.out.println("8. Swap Player Positions");
        System.out.println("9. Check if Level Number is Prime");
        System.out.println("10. Calculate Factorial for Game Rewards");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch(choice){
            case 1: // Highest Score
                System.out.print("Enter array size: ");
                int size1 = scan.nextInt();
                int arr1[] = new int[size1];
                System.out.println("Enter elements:");
                for(int i=0; i<size1; i++){
                    arr1[i] = scan.nextInt();
                }
                int max = arr1[0];
                for(int i=0; i<size1; i++){
                    if(arr1[i] > max){
                        max = arr1[i];
                    }
                }
                System.out.println("Highest Score: " + max);
                break;

            case 2: // Lowest Score
                System.out.print("Enter array size: ");
                int size2 = scan.nextInt();
                int arr2[] = new int[size2];
                System.out.println("Enter elements:");
                for(int i=0; i<size2; i++){
                    arr2[i] = scan.nextInt();
                }
                int min = arr2[0];
                for(int i=0; i<size2; i++){
                    if(arr2[i] < min){
                        min = arr2[i];
                    }
                }
                System.out.println("Lowest Score: " + min);
                break;

            case 3: // Total Points
                System.out.print("Enter array size: ");
                int size3 = scan.nextInt();
                int arr3[] = new int[size3];
                System.out.println("Enter elements:");
                for(int i=0; i<size3; i++){
                    arr3[i] = scan.nextInt();
                }
                int sum = 0;
                for(int i=0; i<size3; i++){
                    sum += arr3[i];
                }
                System.out.println("Total Points: " + sum);
                break;

            case 4: // Reverse Turn Order
                System.out.print("Enter array size: ");
                int size4 = scan.nextInt();
                int arr4[] = new int[size4];
                System.out.println("Enter elements:");
                for(int i=0; i<size4; i++){
                    arr4[i] = scan.nextInt();
                }
                System.out.println("Reversed Turn Order:");
                for(int i=size4-1; i>=0; i--){
                    System.out.print(arr4[i] + " ");
                }
                break;

            case 5: // Search for Player Score
                System.out.print("Enter array size: ");
                int size5 = scan.nextInt();
                int arr5[] = new int[size5];
                System.out.println("Enter elements:");
                for(int i=0; i<size5; i++){
                    arr5[i] = scan.nextInt();
                }
                System.out.print("Enter score to search: ");
                int key = scan.nextInt();
                boolean found = false;
                for(int i=0; i<size5; i++){
                    if(arr5[i] == key){
                        System.out.println("Score found at position: " + (i+1));
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("Score not found!");
                }
                break;

            case 6: // Average Score
                System.out.print("Enter array size: ");
                int size6 = scan.nextInt();
                int arr6[] = new int[size6];
                System.out.println("Enter elements:");
                for(int i=0; i<size6; i++){
                    arr6[i] = scan.nextInt();
                }
                int sum6 = 0;
                for(int i=0; i<size6; i++){
                    sum6 += arr6[i];
                }
                double avg = (double) sum6 / size6;
                System.out.println("Average Score: " + avg);
                break;

            case 7: // Count Even & Odd
                System.out.print("Enter array size: ");
                int size7 = scan.nextInt();
                int arr7[] = new int[size7];
                System.out.println("Enter elements:");
                for(int i=0; i<size7; i++){
                    arr7[i] = scan.nextInt();
                }
                int evenCount = 0, oddCount = 0;
                for(int i=0; i<size7; i++){
                    if(arr7[i] % 2 == 0){
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                System.out.println("Even Scores: " + evenCount);
                System.out.println("Odd Scores: " + oddCount);
                break;

            case 8: // Swap Player Positions
                System.out.print("Enter array size: ");
                int size8 = scan.nextInt();
                int arr8[] = new int[size8];
                System.out.println("Enter elements:");
                for(int i=0; i<size8; i++){
                    arr8[i] = scan.nextInt();
                }
                System.out.print("Enter first position to swap (index 0-based): ");
                int pos1 = scan.nextInt();
                System.out.print("Enter second position to swap (index 0-based): ");
                int pos2 = scan.nextInt();

                int temp = arr8[pos1];
                arr8[pos1] = arr8[pos2];
                arr8[pos2] = temp;

                System.out.println("Array after swapping:");
                for(int i=0; i<size8; i++){
                    System.out.print(arr8[i] + " ");
                }
                break;

            case 9: // Check Prime Level
                System.out.print("Enter a level number: ");
                int num = scan.nextInt();
                boolean prime = true;
                if(num <= 1){
                    prime = false;
                } else {
                    for(int i=2; i<num; i++){
                        if(num % i == 0){
                            prime = false;
                            break;
                        }
                    }
                }
                if(prime){
                    System.out.println(num + " is a Prime Level");
                } else {
                    System.out.println(num + " is NOT a Prime Level");
                }
                break;

            case 10: // Factorial
                System.out.print("Enter a number: ");
                int n = scan.nextInt();
                int fact = 1;
                for(int i=1; i<=n; i++){
                    fact *= i;
                }
                System.out.println("Factorial: " + fact);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
