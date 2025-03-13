package NumbersPrac;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int ip = sc.nextInt();
        int f = 1;

        if(ip == 0) {
            System.out.print(f);
            return;
        }

        while(ip != 0) {
            f *= ip;
            ip--;
        }
        System.out.print(f);
    }
}
