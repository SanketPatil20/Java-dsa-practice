package basicMaths;

public class gcdHcf {

    public static void main(String[] args) {
        int[] nums = {12, 18, 24, 10, 45};
        System.out.println("GCD of min and max in array: " + findGCD(nums));
    }

    public static int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int a = max;
        int b = min;

        while (a > 0 && b > 0) {
            if (b > a) {
                b = b % a;
            } else if (a > b) {
                a = a % b;
            }
        }

        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }
}


//    Bruteforce Approach

//    class Solution {
//        public static int[] lcmAndGcd(int a, int b) {
//            int gcd = 1;
//            int min = Math.min(a, b);
//
//            for(int i = 1; i <= min; i++){
//                if (a % i == 0 && b % i == 0){
//                    gcd = i;
//                }
//            }
//
//            int lcm = (a * b) / gcd;
//            return new int[]{lcm, gcd};
//        }
//    }