package Basics;

import java.util.Scanner;

public class NthFibonacci {
    public static int fibonacci(int n) {
        int n3=0;
        int n1 = 1;
        int n2 = 1;
        if (n == 1) {
            return n1;
        }
        else if (n == 2) {
            return n2;
        }
        else {
            for (int count = 3; count <= n; count++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth value: ");
        int n = sc.nextInt();
        System.out.print("nth fibonacci number is "+fibonacci(n));
    }
}
