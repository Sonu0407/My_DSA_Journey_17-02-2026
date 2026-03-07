package Quick_Sort_Recursion;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void quick_sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            // call recursion for the left half call
            quick_sort(arr, start, pivotIndex-1);
            // call recursion for right half call
            quick_sort(arr, pivotIndex+1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int index = start-1;
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                index++;
                swap(arr, i, index);
            }
        }

        index++;
        swap(arr, end, index);
        return index;
    }

    static void swap(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
