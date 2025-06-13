package basicMaths;

public class sumOfDivisors {
    public static long sumOfDivisor(long n) {
        int sumT = 0;

        for (int j = 1; j <= n; j++) {
            int sum = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            sumT += sum;
        }

        return sumT;
    }
}
