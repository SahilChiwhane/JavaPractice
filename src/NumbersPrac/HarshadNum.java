package NumbersPrac;

import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int ip = sc.nextInt();
        int temp = ip;
        int sum = 0;

        while(temp != 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        if(ip % sum == 0) {
            System.out.println(ip + " = Harshad Number");
        } else {
            System.out.println(ip + " != Harshad Number");
        }
    }
}
