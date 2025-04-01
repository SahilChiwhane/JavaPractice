package ArraysPrac;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

//      Create an array of the specified size
        int[] arr = new int[size];

//      Ask user to input elements in an array
        System.out.println("Enter " + size + " elements: ");

//      loop to take input for each element of the array
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

//      Print the Array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

//      Find max number
        int max = arr[0];

        for(int i = 0; i < size; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Number in an Array = " + max);

        sc.close();
    }
}
