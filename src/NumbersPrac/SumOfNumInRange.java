package NumbersPrac;

import java.util.Scanner;

public class SumOfNumInRange {

    public static void main(String[] args) {

        System.out.print("Enter initial value = ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.print("Enter final value = ");
        int num2 = sc.nextInt();

        int sum = 0;

        for(int i = num1 + 1; i < num2; i++) {
            sum += i;
        }

        System.out.print("Sum = " + sum);
    }
}
