package NumbersPrac;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int ip = sc.nextInt();
        System.out.print("Enter the power = ");
        int p = sc.nextInt();
        int pow = 1;

        while(p != 0) {
            pow *= ip;
            p--;
        }
        System.out.print(pow);
    }
}
