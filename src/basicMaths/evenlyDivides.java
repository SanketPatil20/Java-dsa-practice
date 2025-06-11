package basicMaths;

public class evenlyDivides {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(dividingNum(n));
    }

    static int dividingNum(int n) {
        int count = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n = n / 10;
        }

        return count;
    }
}
