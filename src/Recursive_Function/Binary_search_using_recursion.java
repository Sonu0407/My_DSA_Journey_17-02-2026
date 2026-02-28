package Recursive_Function;

public class Binary_search_using_recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 1;
        System.out.println(binary_search(arr, target, 0, arr.length-1));

    }

    static int binary_search(int[] arr, int target, int s, int e) {
        // base condition
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (target == arr[m]) {
            return m;
        }

        if (target < arr[m]) {
            return binary_search(arr, target, s, m - 1);
        }

        return binary_search(arr, target, m + 1, e);

    }
}
