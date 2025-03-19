package NumbersPrac;

import java.util.Scanner;

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        System.out.print("Enter the number of inputs: ");
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();

        while(ip != 0) {
            System.out.print("Enter the Number = ");
            int num = sc.nextInt();
            int sum = 0;
            while(num != 0) {
                sum += num % 10; // sum = sum + num % 10
                num /= 10; // num = num / 10
            }
            System.out.println("The sum of Digits = " + sum);
            ip--;
        }
    }
}
