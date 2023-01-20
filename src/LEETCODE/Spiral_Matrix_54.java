package LEETCODE;
import java.util.Arrays;

import java.util.ArrayList;
//import java.util.List;
//
//public class Spiral_Matrix_54 {
//    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//
//    }
//
//    static List<Integer> spiralOrder(int[][] matrix) {
//        ArrayList<Integer> list = new ArrayList<>();
////        int row_start=0,row_end=arr.length-1;
//
//    }
//}

public class Spiral_Matrix_54{
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        ArrayList<Integer> list = new ArrayList<>();
        int row_start=0,row_end=arr.length-1;
        int col_start=0,col_end=arr[0].length-1;
        while(row_start<=row_end && col_start<=col_end){
//            left to right
            for(int i=col_start;i<=col_end;i++){
                list.add(arr[row_start][i]);
            }
            row_start++;
            // top to bottom

            for(int i=row_start;i<=row_end;i++){
                list.add(arr[i][col_end]);
            }
            col_end--;
            //right to left
            if(row_start<=row_end && col_start<=col_end) {


                for (int i = col_end; i >= col_start; i--) {
                    list.add(arr[row_end][i]);
                }
                row_end--;
                // bottom to top
                for (int i = row_end; i >= row_start; i--) {
                    list.add(arr[i][col_start]);
                }
                col_start++;
            }
        }
        System.out.println(list);

    }
}
