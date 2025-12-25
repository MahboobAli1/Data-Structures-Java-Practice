package binary.search.algorithm;

/**
 *
 * @author Mahboob
 */
public class BinarySearchAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 9, 11}; // sorted array
        int target = 9;

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        // for loop without increment, just like a while loop
        for (; start <= end;) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                System.out.println("Target found at index: " + mid + " target is: " + arr[mid]);
                found = true;
                break;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target not found.");
        }
    }
}
