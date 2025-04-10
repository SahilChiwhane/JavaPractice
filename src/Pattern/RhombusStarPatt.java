package Pattern;

import java.util.Scanner;

public class RhombusStarPatt {

    public static void RhombusPatt(int num) {
        for(int i = 0; i < num; i++) {
            int k = i;
            while(k != 0) {
                System.out.print(" ");
                k--;
            }
            for(int j = 0; j < num; j++) {
                System.out.print("*");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        RhombusPatt(num);
    }
}
