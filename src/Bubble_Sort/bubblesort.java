package Bubble_Sort;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr) {
        // for each step it is going n - 1
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index
            // j start from one
            for (int j = 1; j < arr.length - i; j++) {
                // now compare the values
                if (arr[j] < arr[j-1]){ // example if arr[j] = 2 < arr[j-1] = 5 // i will write like this
                    // now swap it
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
