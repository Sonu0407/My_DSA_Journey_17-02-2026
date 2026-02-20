package Binary_Search;

public class Practice_Binary_S {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int ans = find_the_floor(arr, target);
        System.out.println(ans);

    }

    // Question no1: Find the floor number in the array
    // arr = [1, 2, 8, 10, 10, 12, 19]
    static int find_the_floor(int [] arr, int target) {

        if (target == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2; // this is to control the overflow of int and use boardmas rule to calculate it.
//            int sum = start + end;
//            int mid = Math.floorDiv(sum , 2);// 0 + 6 // 2 floor division

//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
