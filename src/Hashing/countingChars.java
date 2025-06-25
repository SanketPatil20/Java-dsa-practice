package Hashing;
import java.util.*;

public class countingChars {


    public static void main(String[] args) {
        String s = "jsamnsfnksadaazzzxyy";
        int[] hash = new int[26];

        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(hash));
    }
}
