package Insertion_Sort;

import java.util.Arrays;

public class Insertion_Sort_Algo {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion_sort(int[] arr){
        // i loop with the n - 2 so that you won't out of bound error
        for (int i = 0; i < arr.length - 1; i++) {
            // now run j loop with j is always > greater than 0 so that it will not check the 0 element
            // and use j+1 to increase range to check to sort the values and j-- to go backwords checking
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
