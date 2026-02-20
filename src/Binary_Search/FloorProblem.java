package Binary_Search;

public class FloorProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = find_the_floor_number(arr, target);
        System.out.println(ans);

    }

    static int find_the_floor_number(int[] arr, int target) {
        // floor number means = find the smallest element in array < (less) or = target
        // for example if arr = [2, 3, 5, 9, 14, 16, 18] target = 3 then the smallest number
        // and is less than target = 2 in this case
        // use same binary search algorithm and the return the end value because the while
        // condition is when start < end so when end becomes end = start - 1 then the while loop
        // breaks and return end which is 2 in this case
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
