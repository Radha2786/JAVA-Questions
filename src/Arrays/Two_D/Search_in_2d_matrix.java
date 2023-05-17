package Arrays.Two_D;

public class Search_in_2d_matrix {
    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 30;
        System.out.println(Search(arr,target));
    }
    public static boolean Search(int[][] arr, int target){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(target==arr[row][col]){
                return true;
            }else if(target>arr[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
