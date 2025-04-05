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
        for(int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < size - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

//      Count frequency of elements of an array
        for(int i = 0; i < size; i++) {
            int count = 1;
            while(i < size - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println("Count of " + arr[i] + " : " + count);
        }

    }
}
