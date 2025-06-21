package recursionBasics;

public class moveZeros_283 {

        public void moveZeroes(int[] nums) {
            int pos = 0;

            for(int i= 0; i<=nums.length-1; i++){
                if(nums[i] != 0){
                    nums[pos] = nums[i];
                    pos++;
                }
            }
            // System.out.print(pos);
            for(int j = pos; j<=nums.length-1;j++){
                nums[j] = 0;
                pos++;
            }
        }

}


//Approach: Two Pointers

//pos = 0
//Traverse the array with i from 0 to n - 1
//If nums[i] != 0, assign nums[pos] = nums[i], then increment pos
//After the loop, fill the remaining positions (from pos to end) with 0
