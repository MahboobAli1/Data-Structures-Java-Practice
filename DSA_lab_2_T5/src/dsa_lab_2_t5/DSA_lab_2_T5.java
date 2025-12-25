package dsa_lab_2_t5;

public class DSA_lab_2_T5 {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 7};

        System.out.println("Original array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("After pass " + (i + 1) + ": ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
