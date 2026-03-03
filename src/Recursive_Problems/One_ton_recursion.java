package Recursive_Problems;

public class One_ton_recursion {
    public static void main(String[] args) {
        funcrev(5);
        System.out.println("++++++++++++++++");
        func(5);
        System.out.println("++++++++++++++++");
        funcBoth(5);
    }

    static void funcrev(int n) { // from 5, 4, 3, 2, 1
        // base condition
        if (n == 0) {
            return;
        }

        System.out.println(n);
        funcrev(n-1);
    }

    static void func(int n) { // from 1, 2, 3, 4, 5
        // base condition
        if (n == 0) {
            return;
        }
        func(n-1);
        System.out.println(n);
    }

    static void funcBoth(int n) { // from 1, 2, 3, 4, 5
        // base condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }
}
