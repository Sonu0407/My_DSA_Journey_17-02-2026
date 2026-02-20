package Binary_Search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, };
        int[] arr = {99, 85, 72, 65, 58, 42, 33, 21, 17, 4, 2, 1, -10, -18, -32};
        int target = 99;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
