package Recursive_Problems;

public class Digits_Products {
    public static void main(String[] args) {
        System.out.println(product(1342));

    }

    static int product(int n) {
        if (n%10 == n) { // replace from n == 0 return 1 because 0 * mul by any number it is zero
            return n;
        }

        return n%10 * product(n/10);
    }
}
