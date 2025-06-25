package Hashing;

import java.util.ArrayList;
import java.util.List;

public class countingFrequencies {
    class Solution {
        // Function to count the frequency of all elements from 1 to N in the array.
        public List<Integer> frequencyCount(int[] arr) {
            // do modify in the given array
            int n = arr.length;
            int hash[] = new int[n+1];

            for(int i = 0; i< arr.length; i++){
                int val = arr[i];
                hash[val]++;
            }

            List<Integer> res = new ArrayList<>();

            for(int j = 1; j<=n ; j++){
                res.add(hash[j]);
            }
            return res;
        }
    }

}
