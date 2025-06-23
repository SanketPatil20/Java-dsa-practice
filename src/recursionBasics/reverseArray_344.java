package recursionBasics;

public class reverseArray_344 {


        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while(left < right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

                left++;
                right--;
            }
        }
    }


//Two Pointers Approach
//The two pointers technique involves using two indices (pointers) to traverse a data structure (like an array or string) from both ends, or from different speeds/directions, to solve problems efficiently in linear time.

//Use it when:
//You need to reverse or scan from both ends
//You’re looking for pairs or conditions based on values at both ends
//You want to solve in-place with O(1) extra space
//Goal: Reverse a given character array s in-place.

//Initialize two pointers:
//left = 0 (start of the array)
//right = s.length - 1 (end of the array)
//While left < right:
//Swap s[left] and s[right]
//Move left++, right--
//Stop when left >= right

//recursive approach:
//class Solution {
//    public void reverseString(char[] s) {
//
//        swap(s, 0, s.length-1);
//
//    }
//
//    public void swap(char[] s, int left, int right){
//        if(left > right) return;
//
//        char temp = s[left];
//        s[left] = s[right];
//        s[right] = temp;
//
//        swap(s, left+1, right-1);
//    }
//}
//
// Recursive approach uses extra memory due to call stack and has higher overhead, making it slower and less efficient than the iterative two-pointer method in Java.
// For a string of size 100,000, recursion can potentially create up to 50,000 stack frames (before tail unwinds).