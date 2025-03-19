package NumbersPrac;

import java.util.Scanner;

public class AbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum > num) {
            System.out.print(num + " is an Abundant Number");
        } else {
            System.out.print(num + " is not an Abundant Number");
        }
    }
}
