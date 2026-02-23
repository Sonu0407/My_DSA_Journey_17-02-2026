package Patterns;

public class solving_patterns {
    public static void main(String[] args) {
        int n = 4;
        pattern1(4);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern31(4);
        System.out.println();
        pattern32(4);
        System.out.println();
        pattern35(4);
    }

    static void pattern1(int n) {
        // run the outer loop which is number of rows in the pattern
        for (int i = 0; i < n; i++) {
            // run the inner loop that is how many cols in each row
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
    static void pattern2(int n) {
        // this outer loop runs number of rows
        for (int i = 0; i < n; i++) {
            // this inner loop runs number of cols
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern3(int n) {
        // the outer for loop runs row times
        for (int i = n; i > 0; i--) {
            // this inner for loop runs cols times
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        // the outer for loop runs row times
        for (int i = 1; i <= n; i++) {
            // this inner for loop runs cols times
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+ j);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) { // n * 2 because pattern form when it is 2 times of the n and the total - 1
            // for example if it n = 5 then 2 * 5 = 10 and the loop should until 1 - 9 then the pattern forms
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) { // n * 2 because pattern form when it is 2 times of the n and the total - 1
            // for example if it n = 5 then 2 * 5 = 10 and the loop should until 1 - 9 then the pattern forms
            int totalColsInRow = row > n ? 2 * n - row : row;
            int numberOfSpaces = n - totalColsInRow;

            for (int i = 0; i < numberOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30 (int n) {
        for (int row = 1; row <= n; row++) {

            int spaces = n - row;
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(" " + col);
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern17 (int n) {
        for (int row = 1; row <= 2 * n ; row++) {
            int c = row > n ? 2 * n - row : row;
            int spaces = n - c;

            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(" " + col);
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        for (int row = 0; row < 2 * n; row++) {
            for (int col = 0; col < 2 * n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        int original_n = n;
        n = 2 * n;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = original_n - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern35(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
