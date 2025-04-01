package ArraysPrac;

import java.util.Scanner;

public class SmallNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array = ");
        int size = sc.nextInt();

//      Create an array of the specified size
        int[] arr = new int[size];

//      input elements in an Array
        System.out.println("Enter " + size + " Elements: ");

//      loop to take input for each element of an array
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

//      print array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

//      loop to find smallest num
        int min = arr[0];
        for(int i = 0; i < size; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Number in an Array = " + min);

        sc.close();
    }
}
