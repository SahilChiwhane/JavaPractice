package ArraysPrac;

import java.util.Scanner;

public class SumOfEleArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

//      sum of elements of an array
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println();
        System.out.println("Sum of all Elements of an Array = " + sum);
    }
}
