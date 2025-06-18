package recursionBasics;

public class printNto1 {

    void printNos(int N) {
        // code here

        if (N > 0) {
            System.out.print(N + " ");
            printNos(N - 1);
        }
        return;
    }
}
