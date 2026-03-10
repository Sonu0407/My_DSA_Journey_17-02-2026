package Subset_Subsequence_and_String_Recursion;

import java.util.ArrayList;

public class find_the_subsequnce {
    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseqArray("", "abc")); // [abc, ab, ac, a, bc, b, c, ]
    }

    static void subseq(String temp, String word) {
        if (word.isEmpty()) {
            System.out.println(temp); // because it will be stored in it
            return; // stop everything
        }

        char ch = word.charAt(0);

        subseq(temp + ch, word.substring(1)); // accept the ch or
        subseq(temp,word.substring(1)); // reject the ch
    }


    // returning subseq in arraylist
    static ArrayList<String> subseqArray(String temp, String word) {
        if (word.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(temp);
            return list;
        }

        char ch = word.charAt(0);

        ArrayList<String> left = subseqArray(temp + ch, word.substring(1));
        ArrayList<String> right = subseqArray(temp, word.substring(1));

        left.addAll(right); // adds everything from right to left
        return left; // though both are same so return anything
    }
}
