package ArraysPrac;

import java.util.Scanner;

public class RepeatingEleArr {

    public static int[] inputEle(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements:\n");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Print an Array
    public static void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a newline for better readability
    }

    // Sort an Array
    public static void sortArray(int[] arr, int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Find Repeating Elements
    public static void RepeatingEle(int[] arr, int size) {
        boolean foundDuplicate = false;

        for (int i = 0; i < size - 1; i++) {
            // Only check the next element if it's not a duplicate
            if (i < size - 1 && arr[i] == arr[i + 1]) {
                if (!foundDuplicate || arr[i] != arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                }
            }
        }

        // If no repeating elements were found
        if (!foundDuplicate) {
            System.out.println("No repeating elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        // Step 1: Take the input Elements in an Array
        int[] arr = inputEle(size);

        // Print Array
        System.out.print("Original Array: ");
        printArr(arr, size);

        // Sort an Array
        sortArray(arr, size);
        System.out.print("Sorted Array: ");
        printArr(arr, size);

        // Find Repeating Elements
        System.out.print("Repeating Elements: ");
        RepeatingEle(arr, size);
    }
}
