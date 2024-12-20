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

//    public static void pattern7(int n){
//        for (int i =n; i >= 1; i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"" );
//            }
//            System.out.println("");
//        }
//        System.out.println(" ");
//    }



    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
//        pattern7(n);
    }

}
