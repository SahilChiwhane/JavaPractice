package NumbersPrac;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num = sc.nextInt();
        int temp, rev = 0;

        temp = num;
        while(temp != 0) {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }

        if(num == rev) {
            System.out.print(num + " is Palindrome");
        } else {
            System.out.print(num + " is not Palindrome");
        }
    }
}
