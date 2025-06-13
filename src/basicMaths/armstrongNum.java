package basicMaths;

public class armstrongNum {
    public static boolean isArmstrong(int n) {
        int originalNum = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, numDigits);
            n = n / 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int number = 153; // You can change this number to test others
        System.out.println(isArmstrong(number));
    }
}
