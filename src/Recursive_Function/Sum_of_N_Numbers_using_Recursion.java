package Recursive_Function;

public class Sum_of_N_Numbers_using_Recursion {
    public static void main(String[] args) {
        int n = -1;
        System.out.println(sum_of_n(n));

    }

    static int sum_of_n(int n) {
        // base condition
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + sum_of_n(n - 1);
    }
}
