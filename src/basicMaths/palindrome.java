package basicMaths;

import java.util.Scanner;

public class palindrome {
    public static boolean checkPalindrome(int x){
        int originalN = x;
        int rev = 0;

        while(x > 0){
            int lastNum = x % 10;
            x = x / 10;
            rev = rev * 10 + lastNum;
        }

        return rev == originalN;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Is palindrome? " + checkPalindrome(x));
    }
}
