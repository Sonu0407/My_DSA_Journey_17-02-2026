package Recursion_in_Arrays;

import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 7};
        int target = 7;
//        System.out.println(linear_search(arr, target, 0));
//        System.out.println(index_linear_search(arr, target, 0));
        all_index_linear_search(arr, target, 0);
        System.out.println("This is output of outside list " + list);
        System.out.println(list_all_index(arr, target, 0, new ArrayList<>()));

    }

    static boolean linear_search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || linear_search(arr, target, index+1);
    }

    static int index_linear_search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return index_linear_search(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void all_index_linear_search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        all_index_linear_search(arr, target, index + 1);
    }


    static ArrayList<Integer> list_all_index (int[] arr, int target, int index, ArrayList<Integer> storage) {
        if (index == arr.length) {
            return storage;
        }

        if (arr[index] == target) {
            storage.add(index);
        }

        return list_all_index(arr, target, index + 1, storage);
    }
}
