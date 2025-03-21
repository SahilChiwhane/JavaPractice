package FunctionsPrac;

import java.util.Scanner;

public class LeapYear {
    public static void leapYearOrNot(int year) {
        if(year <= 0) {
            System.out.print("Enter a valid Year");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.print(year + " is a Leap Year");
        } else {
            System.out.print(year + " is not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year = ");
        int year = sc.nextInt();

        leapYearOrNot(year);
    }
}
