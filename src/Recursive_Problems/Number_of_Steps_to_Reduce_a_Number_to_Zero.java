package Recursive_Problems;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}
