package recursionBasics;

public class print1toN {

    public void printNos(int N) {
        if (N > 0) // The loop runs till N>1
        {
            printNos(N -1); // We keep on recursing till the end as we want to pritn from 1 to N
            System.out.print(N + " "); // When recursion is done then print N
        }
        return;
    }

}


// Using helper function
//public void printNos(int n) {
//    // Code here
//    printN(1,n);
//}
//
//void printN(int i, int n){
//    if(i > n) return;
//
//    System.out.print(i + " ");
//
//    printN( i+1, n);
//
//}