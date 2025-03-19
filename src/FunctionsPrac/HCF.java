package FunctionsPrac;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = sc.nextInt();

        int hcf = HCFOfTwoNum(num1, num2);
        System.out.print("HCF OF " + num1 + " and " + num2 + " = " + hcf);
    }

    public static int HCFOfTwoNum(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
