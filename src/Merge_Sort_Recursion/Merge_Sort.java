package Merge_Sort_Recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 1};
//        int[] arr = {5,1,1,2,0,0};
        merge_sort_Inplace(arr, 0, arr.length);
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

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


    static void merge_sort_Inplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        merge_sort_Inplace(arr, s, mid);
        merge_sort_Inplace(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }

    private static void mergeInplace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

}
