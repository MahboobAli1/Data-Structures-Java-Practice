/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jump_search_algorithm;

/**
 *
 * @author Mahboob
 */
public class Jump_Search_algorithm {

    // --- Jump Search method ---
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) return -1;

        int blockSize = (int) Math.floor(Math.sqrt(n));
        int start = 0;
        int end = blockSize;

        // Keep jumping while the last element of the block is less than target
        while (start < n && arr[Math.min(end, n) - 1] < target) {
            start = end;
            end += blockSize;
            if (start >= n) return -1; // we jumped past the array
        }

        // Linear search inside the block [start, end)
        for (int i = start; i < Math.min(end, n); i++) {
            if (arr[i] == target) return i; // found!
            if (arr[i] > target) break;    // can stop early since array is sorted
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {22, 66, 77, 99, 122, 145, 222};
        int target = 122;

        int index = jumpSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in array.");
        }
    }
}
