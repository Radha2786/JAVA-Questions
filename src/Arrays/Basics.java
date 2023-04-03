package Arrays;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] brr = {100, 200, 300, 400, 500};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        swap(arr, brr);
        System.out.println("after swapping");

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }

    static void swap(int[] arr, int[] brr) {
        int[] t = arr;
        arr = brr;
        brr = t;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}