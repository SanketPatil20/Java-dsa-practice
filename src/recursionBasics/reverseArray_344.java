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


//Two Pointers Approach – Quick Revision Note
//🔹 What is the Two Pointers Approach?
//The two pointers technique involves using two indices (pointers) to traverse a data structure (like an array or string) from both ends, or from different speeds/directions, to solve problems efficiently in linear time.
//
//🔹 When to Use It?
//Use it when:
//
//You need to reverse or scan from both ends
//You’re looking for pairs or conditions based on values at both ends
//You want to solve in-place with O(1) extra space
//Goal: Reverse a given character array s in-place.
//
//        Steps:
//
//Initialize two pointers:
//left = 0 (start of the array)
//right = s.length - 1 (end of the array)
//While left < right:
//Swap s[left] and s[right]
//Move left++, right--
//Stop when left >= right
