package merge.sort;

/**
 *
 * @author Mahboob
 */

public class SimpleMergeSort {

    // Recursive sort function
    static void mergeSort(int arr[], int l, int r) {
        if (l >= r) return;  // base condition (single element)

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);       // sort left part
        mergeSort(arr, mid + 1, r);   // sort right part
        merge(arr, l, mid, r);        // merge both sorted parts
    }

    // Merge function
    static void merge(int arr[], int l, int mid, int r) {

        int i = l, j = mid + 1;
        int temp[] = new int[r - l + 1];
        int k = 0;

        // Merge two sorted subarrays
        while (i <= mid && j <= r) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }

        // Copy remaining left part
        while (i <= mid) temp[k++] = arr[i++];

        // Copy remaining right part
        while (j <= r) temp[k++] = arr[j++];

        // Copy temp back to original array
        for (i = 0; i < k; i++) {
            arr[l + i] = temp[i];
        }
    }

    // Main Function (Program starts here)
    public static void main(String[] args) {

        int arr[] = {9, 5, 2, 7};

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
