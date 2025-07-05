package Hashing;

public class MaxMinFreq {

    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5, 3, 2, 2, 2};
        int n = arr.length;
        findFreq(arr, n);
    }

    public static void findFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxF = 0, minF = n;
        int maxN = 0, minN = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > maxF) {
                maxN = arr[i];
                maxF = count;
            }
            if (count < minF) {
                minN = arr[i];
                minF = count;
            }
        }
        System.out.println("Highest frequency element is: " + maxN);
        System.out.println("Lowest frequency element is: " + minN);
    }

}
