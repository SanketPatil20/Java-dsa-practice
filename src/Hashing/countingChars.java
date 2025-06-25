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


    //Using Hashmap

//    HashMap<Character, Integer> freqMap = new HashMap<>();
//
//    for(int i = 0; i < s.length(); i++){
//        char ch = s.charAt(i);
//
//        if(freqMap.containsKey(ch)){
//            freqMap.put(ch, freqMap.get(ch)+1);
//        }
//        else {
//            freqMap.put(ch, 1);
//        }
//    }
//    // Print character frequencies
//        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
//        System.out.println(entry.getKey() + " = " + entry.getValue());
//    }

}
