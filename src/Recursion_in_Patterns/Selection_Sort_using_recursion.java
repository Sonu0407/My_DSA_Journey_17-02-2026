package Recursion_in_Patterns;

import java.util.Arrays;

public class Selection_Sort_using_recursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr, int r, int c, int max) {
        // base condition
        if (r == 0) {
            return;
        }

        // find the maximum number
        if (c < r) {
            // for example 5 > 0
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            } // till here is the finding maximum in the array
        } else {
            swap(arr, max, r-1);
            selection(arr, r-1, 0, 0);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
