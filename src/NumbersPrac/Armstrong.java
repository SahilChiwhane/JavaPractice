package NumbersPrac;

import java.util.Scanner;

public class Armstrong {
    public static int power(int rem, int count){
        int res = 1;
        while(count != 0){ // n = 3 , n = 2 , n = 1 , n = 0
           res =  res  * rem ; // 3 , 9 , 27
           count--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int count = 0, temp1, temp2, sum = 0;

//      count the number of digits
        temp1 = num;
        temp2 = num;
        while(temp1 != 0) {
            temp1 /= 10;
            count++;
        }

//      sum of digits
        while(num != 0) {
            int rem = num % 10;
            sum += power(rem, count); // 27 + 125 + 1 = 153
            num /= 10;
        }

//      Compare original number with the sum
        if(temp2 == sum) {
            System.out.print(temp2 + " = Armstrong Number");
        } else {
            System.out.print(temp2 + " != Armstrong Number");
        }
    }
}
