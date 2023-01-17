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


//    public static void main(String[] args) {


//        int a = 10;
//        int b = 20;
//        System.out.println("a => " + a);
//        System.out.println("b => " + b);
//        swap(a, b);
//
//        System.out.println("a => " + a);
//        System.out.println("b => " + b);
//    }


//    static void swap(int a , int b){
//        int t = a;
//        a = b;
//        b = t;
//        System.out.println("a => " + a );
//        System.out.println("b => " + b);
//    }


//    public static void main(String[] args) {


//    static void call_by_value_example_01(){
//        int[] arr = {10 , 20 , 30 , 40 , 50};
//        System.out.println(arr[0] + "   " + arr[1]);
//        swap(arr[0] , arr[1]);
//        System.out.println(arr[0] + "   " + arr[1]);
//    }
//    }
//    static void swap(int a , int b){
//        int t = a;
//        a = b;
//        b = t;
//        System.out.println("a => " + a );
//        System.out.println("b => " + b);
//    }

//    public static void main(String[] args) {


//        static void call_by_value_02 () {
//            int[] arr = {10, 20, 30, 40, 50};
//            System.out.println(arr[0] + "   " + arr[1]);
//            swap(arr, 0, 1);
//            System.out.println(arr[0] + "   " + arr[1]);
//        }
//    }

//     static void swap(int[] arr , int a , int b){
//        int t = arr[a];
//        arr[a] = arr[b];
//        arr[b] = t;
//
//        System.out.println(arr[a] + "   " + arr[b]);
//    }
//
//}