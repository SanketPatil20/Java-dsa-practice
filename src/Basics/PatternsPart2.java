package Basics;

import static java.util.Collections.min;

public class PatternsPart2 {
    public static void pattern12(int n){
        for(int i = 1; i <=n; i++) {
           for (int j=1; j<=i;j++){
               System.out.print(j);
           }
            for(int j=1; j<= 2*n-2*i; j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern13(int n){
        int counter= 0;
        for(int i = 1; i <=n; i++) {
           for (int j=1; j<=i;j++){
               counter++;
               System.out.print(counter+" ");
           }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern14(int n){
        for(int i = 0; i <n; i++) {
            for (char ch ='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern15(int n){
        for(int i =n-1; i>=0; i--) {
            for (char ch ='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern16(int n){
        for(int i = 0; i <n; i++) {
            char ch = (char) ('A' + i);
            for (int j=0; j<=i;j++){
                System.out.print(ch);
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern21(int n){
        for(int i = 0; i <n; i++) {
            if (i == 0 || i==n-1) {
                for (int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern17(int n){
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPnt = (2*i+1)/2;
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(ch);
                if ( j < breakPnt) ch++;
                else ch--;
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern18(int n){
        char start = (char) ('A' + n -1);
        for(int i = 0; i <n; i++) {
            char ch = (char) (start-i);
            for (int j=0; j<=i; j++){
                System.out.print((char) (ch+j) +" ");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern19(int n){
        int inis = 0;
        for(int i=0; i<n ;i++){

            //For upper half

            //stars
            for (int j=1; j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<inis;j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n-i;j++){
                System.out.print("*");
            }
            inis += 2;
            System.out.println(" ");
        }
        //For lower half

        for(int i = 1; i <=n; i++) {
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2*n-2*i; j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static void pattern20(int n){
        int spaces = 2*n -2 ;
        for (int i=1; i<=2*n-1;i++){
            int stars = i;
            if ( i > n) stars = 2*n -i;
            //stars
            for(int j=1; j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1; j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println("");
            if (i<n) spaces -=2;
            else spaces +=2;
        }

        System.out.println(" ");
    }

//    public static void pattern22(int n){
//        for(int i = 0; i <n; i++) {
//            for (int j=0; j<2*n-1;j++){
//                int top = i;
//                int left = j;
//                int right = (2*n -2)- j;
//                int down = (2*n -2)-i;
//                System.out.print(n-min(min(top, down), min(left,right)));
//            }
//
//
//            System.out.println("");
//        }
//        System.out.println(" ");
//    }


    public static void main(String[] args) {
        int n = 5;

        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
//        pattern22(n);
    }
}
