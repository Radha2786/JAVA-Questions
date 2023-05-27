package GFG;

public class Boolean_matrix_optimised {
    public static void main(String[] args) {
        int[][] arr = {{ 1, 0, 0},
                { 1, 0, 0},
                { 1, 0, 0},
                { 0, 0, 0}};
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        for(int i=0;i<arr.length ; i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0; i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        }
    }

