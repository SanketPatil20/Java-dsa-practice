package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchCase {
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch (choice) {
            case 1:
                double R = arr.get(0);
                return Math.PI*R*R;
            case 2:
                double L = arr.get(0);
                double M = arr.get(1);
                return L*M;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {

        List<Double> arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice 1 or 2: ");
        int choice  = scanner.nextInt();
        if (choice == 1){
        System.out.println("Enter R for calculations: ");
        arr.add(scanner.nextDouble());
        }
        else if(choice == 2){
        System.out.println("Enter L for calculations: ");
        arr.add(scanner.nextDouble());
        System.out.println("Enter B for calculations: ");
        arr.add(scanner.nextDouble());
        }
        else {
            System.out.println("Invalid choice!");
        }

        System.out.println(switchCase(choice,arr));

    }
}
