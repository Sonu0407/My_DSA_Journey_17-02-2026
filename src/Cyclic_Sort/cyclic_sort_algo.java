package Cyclic_Sort;

import java.util.Arrays;

public class cyclic_sort_algo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void cyclic_sort(int[] arr) {
        // step one is check the number is at the right index
        for (int i = 0; i < arr.length; i++) {
            int check = arr[i] - 1;
            if (arr[i] != arr[check]) {
                swap(arr, i, check);
            }
        }
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
