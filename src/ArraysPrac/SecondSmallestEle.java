package ArraysPrac;

import java.util.Scanner;

public class SecondSmallestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        // Check if the size is less than 2
        if (size < 2) {
            System.out.println("Size of an Array should be greater than 1.");
            return; // Exit the program if there aren't enough elements
        }

        int[] arr = new int[size];

        // Get the elements of the array
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Print all the elements of the array
        System.out.print("Array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Initialize variables to store the smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;

        // Find the smallest and second smallest elements
        for (int i = 0; i < size; i++) {
            if (arr[i] < smallest) {
                sec_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < sec_smallest) {
                sec_smallest = arr[i];
            }
        }

        // Print the results
        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + sec_smallest);
    }
}
