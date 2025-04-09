package Pattern;

import java.util.Scanner;

public class HollowSquareStarPatt {

    public static void HollowSquarePatt(int r, int c) {
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= c; j++) {
                if((i == 1 || i == r) || (j == 1 || j == c)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int row = sc.nextInt();

        System.out.print("Enter the number of Columns = ");
        int col = sc.nextInt();

        HollowSquarePatt(row, col);
    }
}
