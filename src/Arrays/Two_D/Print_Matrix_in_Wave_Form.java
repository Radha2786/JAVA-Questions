package Arrays.Two_D;

/*

Input: mat[][] = {{  1, 2,  3,   4}
                   {  5,  6, 7,8}
                   {  9, 10, 11, 12}
                   {13, 14, 15, 16}
                   {17, 18, 19, 20}}
Output: 1 5 9 13 17 18 14 10 6 2 3 7 11 15 19 20 16 12 8 4
Explanation: Output is printed in wave form.

Input: mat[][] = {{1,   9,  4, 10}
                          { 3,   6, 90, 11}
                          { 2, 30, 85, 72}
                          { 6, 31, 99, 15}}
Output: 1 3 2 6 31 30 6 9 4 90 85 99 15 72 11 10

*/

public class Print_Matrix_in_Wave_Form {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}};
        print(arr);
    }


//    --------->row waveform

    static void print(int[][] arr) {
//        for (int col = 0; col < arr[0].length; col++) {
//            if (col % 2 == 0) {
//                for (int row = 0; row < arr.length; row++) {
//                    System.out.print(arr[row][col] + " ");
//                }
//            } else {
//                for (int row = arr.length - 1; row >= 0; row--) {
//                    System.out.print(arr[row][col] + " ");
//                }
//            }
//        }

//  ------>
//  column waveform

        for(int row=0;row<arr.length;row++){
            if(row%2==0){
                for(int col=0;col<arr[row].length;col++){
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for(int col=arr[row].length-1;col>=0;col--){
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
    }
}
