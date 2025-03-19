package NumbersPrac;

import java.util.Scanner;

public class SumOfNum {

    public static void main(String[] args) {

        System.out.print("Enter the number of inputs: ");
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();

        while(ip != 0) {

            System.out.print("Enter num1: ");
            int n1 = sc.nextInt();

            System.out.print("Enter num2: ");
            int n2 = sc.nextInt();

            int sum = n1 + n2;

            System.out.println("Sum of Numbers = " + sum);

            ip--;

        }
    }

}
