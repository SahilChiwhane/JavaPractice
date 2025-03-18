package NumbersPrac;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int ip = sc.nextInt();

        if(ip <= 0) {
            System.out.print(ip + " is not a Perfect Square");
        }

        for(int i = 1; i <= ip; i++) {
            if(i * i == ip) {
                System.out.print(ip + " is a Perfect Square");
                break;
            }
        }
    }
}
