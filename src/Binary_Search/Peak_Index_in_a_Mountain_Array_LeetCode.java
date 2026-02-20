package Binary_Search;

public class Peak_Index_in_a_Mountain_Array_LeetCode {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        // first define the start and end values
        int start = 0;
        int end = arr.length-1;

        // when start less than end
        while (start < end) {
            // find the mid
            int mid = start + (end - start) / 2;

            // find whether it's decreasing or increasing order

            // this is when it is decreasing order
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid + 1 is greater number
            }

        }
        return start;

    }
}
