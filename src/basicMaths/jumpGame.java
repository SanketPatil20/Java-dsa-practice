package basicMaths;

public class jumpGame {

        public boolean canJump(int[] nums) {

//This is the simple greedy approach
// Start from the end of the array and move backwards.
// At each index, check if you can reach the current "finalPosition".
// If yes, update finalPosition to the current index.
// If by the end, finalPosition is 0, it means we can reach the end from the start.


            int finalPosition = nums.length -1 ;

            for (int i = nums.length-2;i>=0;i--){
                if(i + nums[i] >= finalPosition){
                    finalPosition = i;
                }
            }
            return finalPosition == 0;

        }
}





//Another solution using forward approach

//class Solution {
//    public boolean canJump(int[] nums) {
//        int maxReach = 0;
//
//        for(int i=0; i<=maxReach; i++){
//            maxReach = Math.max(maxReach, i + nums[i]);
//            if(maxReach >= nums.length -1 ){
//                return true;
//            }
//        }
//        return false;
//    }
//}

//for the forward approach:
// Traverse the array from the beginning and track the farthest index we can reach (maxReach).
// At each index, update maxReach using: maxReach = max(maxReach, i + nums[i]).
// If at any point maxReach reaches or goes beyond the last index (nums.length - 1), return true.
// If the loop finishes and we never reach the last index, return false.
// This greedy approach ensures we are always keeping track of the maximum reachable position from the current path.
