package Arrays.Two_D;

public class Maximum_sum_of_hour_glass {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}
                        ,{4,5,6},
                        {7,8,9}};
        System.out.println(max_hour_glass(arr));
    }

    static int max_hour_glass(int[][] arr){
        int max = -1;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(i == 0 || j == 0 || i == arr.length-1 || j == arr[i].length-1){
                    continue;
                }
                else{
                    sum = arr[i][j]+arr[i-1][j]+arr[i-1][j+1]+arr[i-1][j-1]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j-1];
                    if(sum > max){
                        max = sum;
                    }
                }
            }

        }
        return max;
    }
}
