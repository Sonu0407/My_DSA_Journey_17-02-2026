package Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cyclic_sort(arr);
    }

    static void cyclic_sort(int[] arr) {
        // step one is check the number is at the right index
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> values = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            int check_value = index + 1;
            if (check_value != arr[index]) {
                values.add(arr[index]);
            }
        }
        System.out.println(values);
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
