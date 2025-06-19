package basicMaths;

//Leetcode_172

public class factorialTrailingZeros {

    public int trailingZeroes(int n) {
        int count = 0;

        for(int i=5; i<=n; i = i*5){
            count = count + (n/i);
        }
        return count;
    }

}

//Key Insight
//A trailing zero is created by multiplying 10 = 2 × 5
//In any factorial n!, the number of 2s as factors is always more than or equal to the number of 5s
//So the number of trailing zeroes is determined by the number of times 5 is a factor in the numbers from 1 to n

//Why Just Count 5s?
//Every time a multiple of 5 appears (like 5, 10, 15...), we get at least one 5
//Some numbers (like 25, 125, etc.) contribute more than one 5

//To count all 5s (including multiples), we add:

//n / 5 → counts 1 five per multiple of 5
//n / 25 → counts extra five per multiple of 25 (5×5)
//n / 125, and so on...

//This continues while 5^k <= n.

//Time Complexity
//O(log₅(n)) — because we multiply i by 5 in each iteration
