package Arrays;

public class elementPrimeFreq {

    public static class Solution {
        public boolean checkPrimeFrequency(int[] nums) {

            boolean[] visited = new boolean[101];
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];

                if (!visited[num]) {
                    visited[num] = true;

                    int count = 0;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == num) count++;
                    }

                    if (count > 1 && isPrime(count)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    // Test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5, 4};
        System.out.println(sol.checkPrimeFrequency(nums1)); // true

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(sol.checkPrimeFrequency(nums2)); // false

        int[] nums3 = {2, 2, 2, 4, 4};
        System.out.println(sol.checkPrimeFrequency(nums3)); // true
    }
}
