package Arrays.Two_D;
import java.util.*;

//array with same row size but different column size
//is called jagged array

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        // taking user input
        for(int i=0;i<n;i++){
            int c = sc.nextInt();
            arr[i]=new int[c];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // printing
        for(int i=0;i<arr.length ; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
