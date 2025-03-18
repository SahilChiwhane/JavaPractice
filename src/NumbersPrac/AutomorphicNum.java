//package NumbersPrac;
//
//import java.util.Scanner;

//public class AutomorphicNum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number = ");
//        int inputNum = sc.nextInt();
//
//        int square = inputNum * inputNum;
//
//            if(square % 10 != inputNum % 10) {
//                System.out.print(inputNum + " is not an Automorphic Number");
//            } else {
//                System.out.print(inputNum + " is a Automorphic Number");
//            }
//    }
//}


package NumbersPrac;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int inputNum = sc.nextInt();

        int square = inputNum * inputNum;

        if(square % 10 != inputNum) {
            System.out.print(inputNum + " is not an Automorphic Number");
            return;
        }

        System.out.print(inputNum + " is a Automorphic Number");
    }
}
