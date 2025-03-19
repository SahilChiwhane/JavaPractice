<<<<<<< HEAD
package NumbersPrac;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) {
            System.out.print(num + " is a Strong Number");
        } else {
            System.out.print(num + " is not a Strong Number");
        }
    }
}
=======
package NumbersPrac;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) {
            System.out.print(num + " is a Strong Number");
        } else {
            System.out.print(num + " is not a Strong Number");
        }
    }
}
>>>>>>> ed9086878f688b8e62b44d69e1d842d11370c644
