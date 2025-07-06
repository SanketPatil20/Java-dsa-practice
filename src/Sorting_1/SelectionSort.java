package Sorting_1;

import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 2, 0, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


//Or you can swap the element one swap per outer loop after finding the smallest element (for doing lesser no of swaps)

//for (int i = 0; i < arr.length - 1; i++) {
//    int min = i;

//     for (int j = i + 1; j < arr.length; j++) {
//            if (arr[j] < arr[min]) {
//                min = j;
//                }
//        }

//Swap after finding the minimum
//int temp = arr[min];
//arr[min] = arr[i];
//arr[i] = temp;
//}

