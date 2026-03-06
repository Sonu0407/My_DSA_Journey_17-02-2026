package Merge_Sort_Recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // what is Arrays.copyOfRange ?
        // The Arrays.copyOfRange method in Java is used to copy a specified range of elements
        // from an original array into a new array. This method is part of the java.util.Arrays class.

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of arrays is not complete
        // copy the remaining elements

        while (i > first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j > second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
