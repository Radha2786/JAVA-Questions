package Arrays.Two_D;

import java.util.Scanner;

public class Transpose_Matrix_867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);
        System.out.println();
        transpose(arr);

    }

    static int[][] transpose(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j =0 ; j < matrix[i].length ; j++){
                arr[i][j] = matrix[j][i];
            }
        }

        print(arr);
        return arr;
    }

    static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
