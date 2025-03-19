<<<<<<< HEAD
package NumbersPrac;

import java.util.Scanner;

public class PrimeFactorsOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();

        while(num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for(int i = 3; i * i <= num; i += 2) {
            while(num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if(num > 2) {
            System.out.print(num);
        }
    }
}
=======
package NumbersPrac;

import java.util.Scanner;

public class PrimeFactorsOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();

        while(num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for(int i = 3; i * i <= num; i += 2) {
            while(num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if(num > 2) {
            System.out.print(num);
        }
    }
}
>>>>>>> ed9086878f688b8e62b44d69e1d842d11370c644
