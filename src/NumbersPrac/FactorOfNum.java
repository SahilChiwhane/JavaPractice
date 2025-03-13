package NumbersPrac;

import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int ip = sc.nextInt();

        for(int i = 1; i < ip; i++) {
            if(ip % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
