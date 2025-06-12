package basicMaths;

import java.util.Scanner;

public class reverseNumber {
    public static int reverse(int x){
        long rev = 0;

        while(x > 0){
            int lastNum = x % 10;
            x = x / 10;

            rev = (rev * 10) + lastNum;
        }

//        For leetcode test case to check only for int

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) rev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int x = sc.nextInt();
        System.out.println("Reversed number: " + reverse(x));
    }
}
