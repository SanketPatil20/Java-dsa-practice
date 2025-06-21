package recursionBasics;

import java.util.ArrayList;

public class factLessThanN {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> result = new ArrayList<>();

        if(n < 1){
            return result;
        }

        long fact = 1;

        long i = 1;

        while(fact <= n){
            result.add(fact);
            i++;
            fact = fact * i;
        }
        return result;
    }
}
