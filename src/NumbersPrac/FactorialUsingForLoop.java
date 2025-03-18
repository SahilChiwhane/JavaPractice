package NumbersPrac;

import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int ip = sc.nextInt();
        int f = 1;

        if(ip == 0) {
            System.out.print(f);
            return;
        }

        for(int i = 1; i <= ip; i++) {
            f *= i;
        }
        System.out.print(f);
    }
}
