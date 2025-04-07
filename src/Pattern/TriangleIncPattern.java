package Pattern;

import java.util.Scanner;

public class TriangleIncPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

//        for(int i = 1; i < num; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        for (int i = 1; i < num; i++) {
            String str = String.valueOf(i);  // Convert the integer to a String
            System.out.println(str.repeat(i));  // Print the number i, i times
        }
    }
}
