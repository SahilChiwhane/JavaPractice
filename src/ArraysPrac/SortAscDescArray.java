package ArraysPrac;

import java.util.Scanner;

public class SortAscDescArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
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

        // Sorting the first half of the array in ascending order using bubble sort
        int temp;
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size / 2 - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Sorting the second half of the array in descending order using bubble sort
        for (int i = size / 2; i < size - 1; i++) {
            for (int j = size / 2; j < size - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("\nSorted array (first half ascending, second half descending):");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
