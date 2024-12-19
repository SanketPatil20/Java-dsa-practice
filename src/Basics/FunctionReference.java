package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionReference {
    static int[] passedBy(int a, int b) {
        a=a+1;
        b=b+2;
        return new int[] {a,b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        //Arrays.toString() required to get a readable string representation of the array.
        System.out.println(Arrays.toString(passedBy(a,b)));
    }
}
