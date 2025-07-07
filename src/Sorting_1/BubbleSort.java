package Sorting_1;
import java.util.*;


public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {48, 32, 12, 25, 10, 15};
        int n = arr.length;

        for (int i = n-1; i>=0 ; i--) {

            int didSwap = 0; //Optimization for the already sorted array input

            for(int j = 0; j<= i-1; j++){ //we are taking j<=i-1 bcz in the next step we are anyways accessing j+1 element which may cause error for the last element of the array
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    didSwap = 1;
                }
            }
            if (didSwap == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
