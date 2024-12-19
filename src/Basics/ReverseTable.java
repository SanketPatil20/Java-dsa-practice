package Basics;

import java.util.Scanner;

public class ReverseTable {
    public static void reverseTable(int n){
        int i=10;
        while (i>=1){
            System.out.print(i*n+" ");
            i--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Reverse table is: ");
        reverseTable(n);
    }
}
