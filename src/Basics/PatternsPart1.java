package Basics;

public class PatternsPart1 {

    public static void pattern1(int n){
        for (int i =0; i < n; i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
    public static void pattern2(int n){
        for (int i =0; i < n; i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern3(int n){
        for (int i =1; i <= n; i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"" );
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern4(int n){
        for (int i =1; i <= n; i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"" );
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern5(int n){
        for (int i =n; i >= 1; i--){
            for (int j=i;j>=1;j--){
                System.out.print("* " );
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern6(int n){
        for (int i =n; i >= 1; i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+"" );
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern7(int n){
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern8(int n){
        for (int i=0; i<n; i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n-(2*i+1) ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern9(int n){
        //Pattern7 code as it is combined with pattern8 called from function
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        pattern8(n);
        System.out.println(" ");
    }

    public static void pattern10(int n){
        for (int i =1; i <= 2*n-1; i++){
            int star = i;
            if (i>n) star = 2*n-i;

            for (int j=1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void pattern11(int n){
        int start = 1;
        for (int i=0; i<n; i++){
            if (i%2==0) start=1;
            else start=0;
            for (int j=0;j<=i;j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
    }

}
