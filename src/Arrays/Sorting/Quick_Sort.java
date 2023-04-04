package Arrays.Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5 , 6, 7, 8, 1 , 2 ,3 , 4};
        int pos = placeAtRightPosition(arr , 0 , arr.length-1);
        System.out.println(pos);
        System.out.println(Arrays.toString(arr));
    }

    static int placeAtRightPosition(int[] arr , int s , int e){
        int last = arr[e];

        int pos = s;

        for(int i = s ; i < e ; i++){

            if(arr[i] < last){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;


                pos++;
            }
        }

        int temp = arr[pos];
        arr[pos] = arr[e];
        arr[e] = temp;

        return pos;
    }
}
