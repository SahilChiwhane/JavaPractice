package NumbersPrac;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Inputs: ");
        int ip = sc.nextInt();

        while(ip != 0) {

            System.out.print("Enter the Year: ");
            int y = sc.nextInt();

            if( (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                System.out.println(y + " is a Leap Year");
            }
            else {
                System.out.println(y + " is not a Leap Year");
            }

            ip--;
        }
    }
}
