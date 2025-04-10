package Pattern;

import java.util.Scanner;

public class MirroredRhombusPatt {

    public static void MirroredRhomb(int num) {
        for(int i = 0; i < num; i++) {
            int k = i;
            while(k < num) {
                System.out.print(" ");
                k++;
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

        MirroredRhomb(num);
    }
}
