package Selection_Sort;

import java.util.Arrays;

public class selection_sort_algo {
    public static void main(String[] args) {
        int [] arr = {3, 1, 5, 4, 2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxNumber = getMaxIndex(arr, 0, last);
            swap(arr, maxNumber, last);
//            int temp = maxnumber;
//            maxnumber = last;
//            last = temp;
        }
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }


    static int getMaxIndex(int[] arr, int first, int second) {
        int max = first;

        // now use for loop for iterate upon arrays
        for (int i = first; i <= second; i++) { // <= because it should compare last one also
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
