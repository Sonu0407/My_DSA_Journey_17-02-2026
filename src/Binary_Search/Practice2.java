package Binary_Search;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 10, 14};
        int k = 15;
        int ans = searchInsertK(arr, k);
        System.out.println(ans);
    }

    // Question 2: Search Insert Position
    static int searchInsertK(int[] arr, int k) {
        // code here
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k < arr[mid]) {
                end = mid - 1;
            } else if (k > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
