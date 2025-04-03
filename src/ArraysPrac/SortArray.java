package ArraysPrac;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements of the array
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Bubble Sort in ascending order
        int temp;
        for (int i = 0; i < size - 1; i++) {  // Outer loop
            boolean swapped = false;
            // Inner loop to compare adjacent elements
            for (int j = 0; j < size - 1 - i; j++) {  // Reduced inner loop range
                if (arr[j] > arr[j + 1]) {  // Swap if the current element is greater than the next one
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Mark that a swap occurred
                }
            }

            // If no swaps were made in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        System.out.println("\nSorted array (in ascending order):");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
