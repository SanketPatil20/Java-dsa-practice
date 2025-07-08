package Sorting_1;

import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {48, 32, 12, 25, 10, 15};
        int n = arr.length;

        for (int i=1 ;i<=n-1; i++) {

            int x = arr[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > x) {
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = x;
        }

        System.out.println(Arrays.toString(arr));
    }
}


//Using different logic
//for(int i=0; i<= n-1 ;i++){
//int j = i;
//            while(j>0 && arr[j-1] > arr[j]){
//int temp = arr[j-1];
//arr[j-1] = arr[j];
//arr[j] = temp;
//j--;
//        }
//        }