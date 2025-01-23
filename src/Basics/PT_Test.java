package Basics;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PT_Test {

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void Leap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void main(String[] args) {
//        ArrayList<String> l1 = new ArrayList<>();
//        l1.add("Ashish");
//        l1.add("Ash");
//        l1.add("hello");
//        l1.add("there");
//        System.out.println(l1.contains("Ashish"));

//        int a = 10;
//        int b = 20;
//        int sum = a+b;
//        System.out.println(sum);
//
//        sum(10,90);
//
//        String name = "Sanket";
//        int salary = 50000;
//        String company = "goldman";
//
//        // Using printf (similar to Python's % formatting)
//        System.out.printf("%s is working in %s with salary %d%n", name, company, salary);
//
//        // Using String.format (similar to Python's .format)
//        System.out.println(String.format("Hello %s your salary is %d and company %s", name, salary, company));
//
//        // Using String.format with named placeholders (emulating Python's keyword arguments)
//        String message = String.format("Hello %s your salary is %d and company %s", name, salary, company);
//        System.out.println(message);

//        int a =123;
//        int a1 = a%10;
//        System.out.println(a1);
//        a= a/10;
//        System.out.println(a);
//        int a2 = a%10;
//        int a3 = a/10;
//        int sum = a1+a2+a3;
//        System.out.println("Sum of digits is: "+ sum);
//
//        int rev = a1*100+a2*10+a3;
//        System.out.println("Reverse number is: "+ rev);

//        String s = "Sanket";
//        System.out.println(s.charAt(s.length()-1));
//        System.out.println(s.charAt(0));
//        System.out.println(s.substring(0,3));

//        int a,b,c,d,e;
//         a= 10;
//         b=12;
//         c=34;
//         d=9;
//         e=25;
//         int max=a;
//        if (b > max){
//            max=b;
//        }
//
//        if (c > max){
//            max=c;
//        }
//        if (d > max){
//            max=d;
//        }
//        if (e > max){
//            max=e;
//        }
//        System.out.println(max);
//    }
//}

//        Leap(2400);

        int n= 12221;
        int count = 0;
        while (n > 0){
            count += 1;
            n= n/10;
        }
        System.out.println(count);


















    }
}