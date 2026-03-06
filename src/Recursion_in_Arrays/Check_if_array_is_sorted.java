package Recursion_in_Arrays;

public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Sorted(arr, 0));

    }

    static boolean Sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length-1) {
            return true;
        }

        return arr[index] < arr[index + 1] && Sorted(arr, index + 1);
    }
}
