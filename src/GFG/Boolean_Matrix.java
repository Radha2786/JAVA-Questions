package GFG;
import java.util.*;

public class Boolean_Matrix {
    public static void main(String[] args) {
       int matrix[][] = {{ 1, 0, 0},
               { 1, 0, 0},
               { 1, 0, 0},
               { 0, 0, 0}};
       int[] row = new int[matrix.length];
       int[] col = new int[matrix[0].length];
       for(int i=0;i<matrix.length;i++) {
           for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j] == 1) {
//                   set1(matrix,i,j,arr,arr2);
                   row[i] = 1;
                   col[j] = 1;
               }
           }
       }

           for(int i = 0 ; i < matrix.length ; i++){
               for (int j = 0 ; j < matrix[0].length ; j++){
                   if(row[i] == 1 || col[j] == 1){
                       matrix[i][j] = 1;
                   }
               }

       }

    }

}
