package Cyclic_Sort;

public class Find_the_Duplicate_Number_Leetcode {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int ans = cyclic_sort(arr);
        System.out.println(ans);


    }
    static int cyclic_sort(int[] arr) {
        // step one is check the number is at the right index
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
