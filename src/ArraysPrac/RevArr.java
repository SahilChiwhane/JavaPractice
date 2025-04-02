package ArraysPrac;

import java.util.Scanner;

public class RevArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements:");

        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

//      Method 1
        for(int i = (size - 1); i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

//      Method 2
        int start = 0;
        int end = size - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println();

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
