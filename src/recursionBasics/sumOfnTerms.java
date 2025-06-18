package recursionBasics;

public class sumOfnTerms {

    //using global variable sum
    int sum = 0;

    int sumOfSeries(int n) {
        // code here
        if(n == 0) return 0;

        sumOfSeries(n - 1);
        sum += n*n*n;

        return sum;
    }
}


//another easy approach

//taking the sum in return statement itself
//int sumOfSeries(int n) {
//    if (n == 0) {
//        return 0;
//    }
//
//    return sumOfSeries(n - 1) + n * n * n;
//}


