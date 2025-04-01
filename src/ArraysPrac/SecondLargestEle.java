package ArraysPrac;

import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements = ");

//      input elements in an array
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

//      Print the array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

//      Second Maximum Element
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++) {
            if(arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_largest && arr[i] != largest) {
                sec_largest = arr[i];
            }
        }

        System.out.println("Second Largest Element in an Array = " + sec_largest);
    }
}
