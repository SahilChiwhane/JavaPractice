package ArraysPrac;

import java.util.Scanner;

public class FreqOfEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//      Sorting of an Array
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

//      frequency of each element is an array
        for(int i = 0; i < size; i++) {
            int count = 1;
            while(i < size - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + " : " + count);
        }

    }
}
