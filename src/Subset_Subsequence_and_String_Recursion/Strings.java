package Subset_Subsequence_and_String_Recursion;

public class Strings {
    public static void main(String[] args) {
        System.out.println(skip_a("acccdajahi"));
        System.out.println(skipApple("acccdapplejahi"));

    }

    static void skip_a(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip_a(p, up.substring(1));
        } else {
            skip_a(p + ch, up.substring(1));
        }
    }

    // method overriding
    static String skip_a(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip_a(up.substring(1));
        } else {
            return ch + skip_a(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) { // skip the size of apple
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
