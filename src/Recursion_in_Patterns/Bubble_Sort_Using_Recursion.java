package Recursion_in_Patterns;

import java.util.Arrays;

public class Bubble_Sort_Using_Recursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble_sort_r(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble_sort_r(int[] arr, int r, int c) {
        // base condition
        if (r == 0) {
            return;
        }

        if (c < r) {

            if (arr[c] > arr[c+1]) {
                swap(arr, c, c+1);
            }
            bubble_sort_r(arr, r, c+1);
        } else {
            bubble_sort_r(arr, r-1, 0);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
