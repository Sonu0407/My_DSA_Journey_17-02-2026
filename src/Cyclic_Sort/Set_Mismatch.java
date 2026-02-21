package Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
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
                values.add(check_value);
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
