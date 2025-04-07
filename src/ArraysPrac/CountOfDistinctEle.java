package ArraysPrac;

import java.util.Scanner;

public class CountOfDistinctEle {

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

    public static void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add newline for better output formatting
    }

    // Sorting an Array (Bubble Sort)
    public static void sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Count of Distinct Elements
    public static void countDistinctElems(int[] arr) {
        System.out.print("\nDistinct Elements = ");
        if (arr.length > 0) {
            int count = 1;
            // Always print the first element
            System.out.print(arr[0] + " ");
            // Iterate through the array, compare current with previous
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                    count++;
                }
            }
            System.out.print("\nCount of Distinct Elements = " + count);
        }
        System.out.println(); // Add newline for better output formatting
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array = ");
        int size = sc.nextInt();

        // Step 1: Take input for the array
        int[] arr = inputEle(size);

        // Print Array before sorting
        printArray(arr);

        // Step 2: Sort the array
        sortArray(arr);

        // Print Array after sorting
        printArray(arr);

        // Count of Distinct Elements
        countDistinctElems(arr);
    }
}
