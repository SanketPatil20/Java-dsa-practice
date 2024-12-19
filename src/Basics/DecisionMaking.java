package Basics;

import java.util.Scanner;

public class DecisionMaking {
    public static String compareNM(int n, int m) {

        if (n < m){
            return "lesser";
        }
        else if (n > m){
            return "greater";
        }
        else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter m: ");
        int m = scanner.nextInt();

        System.out.println(compareNM(n,m));

    }
}

