package Cyclic_Sort;

public class First_Missing_Positive {
    public static void main(String[] args) {
        //nums = [1,2,0]
        int[] arr = {1, 2, 0};
        int ans = cyclic_sort(arr);
        System.out.println(ans);
    }

    static int cyclic_sort(int[] arr) {
        // step one is check the number is at the right index
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
