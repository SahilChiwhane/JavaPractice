package Pattern;

import java.util.Scanner;

public class HollowSquareStarPatt {

    public static void HollowSquarePatt(int rows, int cols) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if((i == 1 || i == rows) || (j == 1 || j == cols)) {
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
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns = ");
        int cols = sc.nextInt();

        HollowSquarePatt(rows, cols);
    }

}
