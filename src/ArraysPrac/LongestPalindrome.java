package ArraysPrac;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] palArr = new int[size];
        int index = 0; // Index to insert into a new Array

        System.out.println("Enter " + size + " elements:");

        // Taking input for the array
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nPalindromes in the array:");

        // Check for palindromes
        for (int i = 0; i < size; i++) {
            int temp = arr[i];
            int sum = 0, rem;
            while (temp != 0) {
                rem = temp % 10; // Get the last digit
                sum = (sum * 10) + rem; // Build the reversed number
                temp = temp / 10; // Remove the last digit
            }

            // If the original number and the reversed number are the same, it's a palindrome
            if (arr[i] == sum) {
                palArr[index++] = arr[i]; // Add to palindrome array
            }
        }

        // Print the palindrome array
        for (int i = 0; i < index; i++) {
            System.out.print(palArr[i] + " ");
        }

        // Sorting palindrome array
        int temp2 = 0;
        for (int i = 0; i < index - 1; i++) {
            for(int j = 0; j < index - 1 - i; j++) {
                if(palArr[j] < palArr[j + 1]) {
                    temp2 = palArr[j + 1];
                    palArr[j + 1] = palArr[j];
                    palArr[j] = temp2;
                }
            }
        }

        System.out.print("\nThe longest Palindrome = " + palArr[0]);
    }
}
