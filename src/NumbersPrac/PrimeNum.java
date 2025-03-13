package NumbersPrac;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {

        System.out.print("Enter the number of Inputs: ");
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();

        int flag = 0;

        while (ip != 0) {
            System.out.print("Enter a num: ");
            int num = sc.nextInt();

            if (num < 2) {
                System.out.println("Non-prime Number");
                return;
            }

            for (int i = 2; i <= num/2; i++) {
                flag = 0;

                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                System.out.println("Non-prime Number");
            } else {
                System.out.println("Prime Number");
            }

            ip--;

        }
    }
}
