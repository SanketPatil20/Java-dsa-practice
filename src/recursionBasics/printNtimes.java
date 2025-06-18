package recursionBasics;

public class printNtimes {

    void printGfg(int N) {
        // code here
        if(N > 0){
            System.out.print("Hello ");
            printGfg(N - 1);
        }
        return;
    }
}
