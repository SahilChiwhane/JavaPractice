package Pattern;

import java.util.Scanner;

public class SquareStarPatt {

    public static void SquarePatt(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number = ");
        int num = sc.nextInt();

        SquarePatt(num);
    }
}
