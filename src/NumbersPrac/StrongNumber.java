<<<<<<< HEAD
package NumbersPrac;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int ip = sc.nextInt();
        int num, sum = 0;
        int temp = ip;

        while(ip != 0) {
            num = ip % 10;
            int fact = 1;

            while(num != 0) {
                fact *= num;
                num--;
            }

            sum += fact;
            ip /= 10;
        }

        if(sum == temp) {
            System.out.print(temp + " is a Strong Number");
        } else {
            System.out.print(temp + " is not a Strong Number");
        }
    }
}
=======
package NumbersPrac;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int ip = sc.nextInt();
        int num, sum = 0;
        int temp = ip;

        while(ip != 0) {
            num = ip % 10;
            int fact = 1;

            while(num != 0) {
                fact *= num;
                num--;
            }

            sum += fact;
            ip /= 10;
        }

        if(sum == temp) {
            System.out.print(temp + " is a Strong Number");
        } else {
            System.out.print(temp + " is not a Strong Number");
        }
    }
}
>>>>>>> ed9086878f688b8e62b44d69e1d842d11370c644
