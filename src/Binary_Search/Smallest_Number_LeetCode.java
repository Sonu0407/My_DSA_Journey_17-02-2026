package Binary_Search;

public class Smallest_Number_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = Ceiling_of_a_number(arr, target);
        System.out.println(ans);

    }
    static int Ceiling_of_a_number(int[] letters, int target) {
        // ceiling number means find the smallest element in the array greater or = target
        // example if array is [2, 3, 5, 9, 14, 16, 18] and target = 15 then the answer should be
        // the number greater than one number > 15 or equal to 15 and by the arr we can say 16 is the ans
        // solution is just same binary search algorithm but return the start index
        int start = 0;
        int end = letters.length - 1;

        // but what if the target is greater than the greatest number in the array

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}

