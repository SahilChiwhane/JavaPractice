package NumbersPrac;

import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Sum of n Natural Numbers = " + ((num * (num + 1))/2));
    }
}
