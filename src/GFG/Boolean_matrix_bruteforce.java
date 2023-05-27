package GFG;
import java.util.*;

public class Boolean_matrix_bruteforce {
    public static void main(String[] args) {
        int[][] arr = {{ 1, 0, 0},
                { 1, 0, 0},
                { 1, 0, 0},
                { 0, 0, 0}};
        for(int i=0;i<arr.length ; i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    Set_minus_one(arr,i,j);
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    static void Set_minus_one(int[][] arr,int row,int col){
        // traversing row
        for(int i=row ; i<arr.length;i++){
            if(arr[i][col]==0){
                arr[i][col]=-1;
            }else{
                continue;
            }
        }
        // traversing column
        for(int j=col ; j<arr[0].length;j++){
            if(arr[row][j]==0){
                arr[row][j]=-1;
            }else{
                continue;
            }
        }

    }

}
