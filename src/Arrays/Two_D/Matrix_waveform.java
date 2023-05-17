package Arrays.Two_D;
import java.util.*;

public class Matrix_waveform {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{0,9,8,7}};
//        for (int col = 0; col < arr[0].length; col++) {
//            if(col%2!=0){
//                for(int row=arr.length-1;row>=0;row--){
//                    System.out.print(arr[row][col]+" ");
//                }
//            }else{
//                for (int row = 0; row < arr.length; row++) {
//                    System.out.print(arr[row][col] + " ");
//                }
//            }
//
//            System.out.println();
//
//        }

//        TRANSPOSE OF MATRIX


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
