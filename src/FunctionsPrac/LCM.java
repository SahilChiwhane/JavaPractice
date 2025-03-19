package FunctionsPrac;

import java.util.Scanner;

public class LCM {

//  Calculate HCF
    public static int hcf(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int LCMOfTwoNum(int a, int b) {
//      Formula to calculate LCM -> LCM = (num1 * num2) / HCF(num1, num2)
        int lcm = (a * b) / hcf(a, b); // Function hcf(a, b) is called
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = sc.nextInt();

        int lcm = LCMOfTwoNum(num1, num2);
        System.out.print("LCM of" + num1 + " and " + num2 + " = " + lcm);
    }
}
