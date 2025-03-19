<<<<<<< HEAD
package NumbersPrac;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int inputNum = sc.nextInt();
        int square = inputNum * inputNum;
        int count = 0;
        int res = 1;
        int temp = inputNum;

        while(temp != 0) {
            count++;
            temp /= 10;
        }

        for(int i = 0; i < count; i++) {
            res *= 10;
        }

        if(square % res == inputNum) {
            System.out.print(inputNum + " is a Automorphic Number");
        } else {
            System.out.print(inputNum + " is not a Automorphic Number");
        }

    }
}
=======
package NumbersPrac;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int inputNum = sc.nextInt();
        int square = inputNum * inputNum;
        int count = 0;
        int res = 1;
        int temp = inputNum;

        while(temp != 0) {
            count++;
            temp /= 10;
        }

        for(int i = 0; i < count; i++) {
            res *= 10;
        }

        if(square % res == inputNum) {
            System.out.print(inputNum + " is a Automorphic Number");
        } else {
            System.out.print(inputNum + " is not a Automorphic Number");
        }

    }
}
>>>>>>> ed9086878f688b8e62b44d69e1d842d11370c644
