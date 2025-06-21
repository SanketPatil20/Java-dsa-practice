package recursionBasics;

public class validPalindrome {

        public boolean isPalindrome(String s) {

            int left = 0;
            int right = s.length() -1 ;

            while(left < right){
                while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                }
                while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                    right--;
                }

                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }

                left++;
                right--;
            }
            return true;
        }
}



//Simpler approach
//class Solution {
//    public boolean isPalindrome(String s) {
//        String fixed_string = "";
//
//        for (char c : s.toCharArray()) {
//            if (Character.isDigit(c) || Character.isLetter(c)) {
//                fixed_string += c;
//            }
//        }
//
//        fixed_string = fixed_string.toLowerCase();
//
//        int a_pointer = 0;
//        int b_pointer = fixed_string.length() - 1;
//
//        while (a_pointer < b_pointer) {
//            if (fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)) {
//                return false;
//            }
//            a_pointer++;
//            b_pointer--;
//        }
//
//        return true;
//    }
//}

