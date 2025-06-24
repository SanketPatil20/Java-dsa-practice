package recursionBasics;

import java.util.ArrayList;
import java.util.List;

public class subSets {

        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0, nums, new ArrayList<>(), result);
            return result;
        }

        private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
            // Add the current subset to the result
            result.add(new ArrayList<>(current));

            for (int i = index; i < nums.length; i++) {
                // Include nums[i]
                current.add(nums[i]);
                // Recurse with next index
                backtrack(i + 1, nums, current, result);
                // Backtrack: remove the last element
                current.remove(current.size() - 1);
            }
        }


}
