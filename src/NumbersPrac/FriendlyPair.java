package NumbersPrac;

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter a num2 = ");
        int num2 = sc.nextInt();
        int sum1 = 0, sum2 = 0;

        for(int i = 1; i <= num1 / 2; i++) {
            if(num1 % i == 0) {
                sum1 += i;
            }
        }

        for(int j = 1; j <= num2 / 2; j++) {
            if(num2 % j == 0) {
                sum2 += j;
            }
        }

        if((sum1 / num1) == (sum2 / num2)) {
            System.out.print(num1 + " and " + num2 + " are Friendly Pair");
        } else {
            System.out.print(num1 + " and " + num2 + " are not Friendly Pair");
        }
    }
}
