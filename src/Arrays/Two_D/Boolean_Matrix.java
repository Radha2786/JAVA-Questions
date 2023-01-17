package Arrays.Two_D;

import java.util.Arrays;

public class Boolean_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{ 1, 0, 0},
                { 1, 0, 0},
                { 1, 0, 0},
                { 0, 0, 0}};
        print(arr);
        System.out.println();
        booleanMatrix(arr);
    }

    static void booleanMatrix(int[][] arr){
        boolean first_row = false;
        boolean first_col = false;

//        CHECK AT FIRST INDEX [0][0]
        if(arr[0][0] == 1){
            first_row = true;
            first_col = true;
        }


        for(int i = 1 ; i < arr.length ; i++){
          // checking for column
            if(arr[0][i] == 1){
                first_row = true;
            }

            // checcking for row
            if(arr[i][0] ==1){
                first_col=true;
            }

            for(int j=1;i<arr.length;i++) {
                if (arr[i][j] == 1) {
                    arr[i][0] = 1;
                    arr[0][j] = 1;
                }
            }
        }

        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr[0].length ; j++){
                if(arr[i][0] == 1 || arr[0][j] == 1){
                    arr[i][j] = 1;
                }
            }
        }

        if(first_row){
            for(int i = 0 ; i < arr[0].length ; i++){
                arr[0][i] = 1;
            }
        }

        if(first_col){
            for(int i = 0 ; i < arr.length ; i++){
                arr[i][0] = 1;
            }
        }

        print(arr);
    }


//    static void booleanMatrix(int[][] arr){
//        int[] row_array = new int[arr.length];
//        int[] col_array = new int[arr[0].length];
//
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                if(arr[i][j] == 1){
//                    row_array[i] = 1;
//                    col_array[j] = 1;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(row_array));
//        System.out.println(Arrays.toString(col_array));
//
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[0].length ; j++){
//                if(row_array[i] == 1 || col_array[j] == 1){
//                    arr[i][j] = 1;
//                }
//            }
//        }
//
//        print(arr);
//
//    }


//    static void booleanMatrix(int arr[][])
//    {
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j =0;j<arr[0].length;j++){
//                if(arr[i][j]==1){
//                    minus(arr,i,j);
//                    print(arr);
//                    System.out.println();
//                }
//            }
//        }
//        SetOne(arr);
//        print(arr);
//    }
//
////    static void minus(int[][] arr,int row,int col){
//////        System.out.println(row + " " +col);
////        for(int i = row-1;i>=0;i--){
////            arr[i][col]=-1;
////        }
////        for(int i=row+1;i<arr.length;i++){
////            arr[i][col]=-1;
////        }
////        for(int j= col+1;j<arr[0].length;j++){
////            arr[row][j]=-1;
////        }
////        for(int j= col-1;j>=0;j--){
////            arr[row][j]=-1;
////        }
////    }
//
//    static void minus(int[][] arr , int row , int col){
////        UPSIDE
//        for(int i = row - 1 ; i >= 0 ; i--){
//            if(arr[i][col] == 1){
//                continue;
//            }
//
//            arr[i][col] = -1;
//        }
////        DOWNSIDE
//        for(int i = row+1; i < arr.length ; i++){
//            if(arr[i][col] == 1){
//                continue;
//            }
//
//            arr[i][col] = -1;
//        }
////        LEFT SIDE
//        for(int  i = col-1 ; i >= 0 ; i--){
//            if(arr[row][i] == 1){
//                continue;
//            }
//
//            arr[row][i] = -1;
//        }
////        RIGHT SIDE
//        for(int i = col+1 ; i < arr[0].length ; i++){
//            if(arr[row][i] == 1){
//                continue;
//            }
//
//            arr[row][i] = -1;
//        }
//    }
//
//    static void SetOne(int[][] arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(arr[i][j]==-1){
//                    arr[i][j]=1;
//                }
//            }
//        }
//    }

    static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
