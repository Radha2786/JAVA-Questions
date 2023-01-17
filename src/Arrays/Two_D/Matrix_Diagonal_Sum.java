package Arrays.Two_D;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum=0;

        for(int i=0; i< arr.length ;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i == j || i+j ==arr[i].length-1){
                    sum=sum+arr[i][j];
                }
            }
        }

//        if(arr.length % 2 == 1){
//            sum = sum - arr[arr.length/2][arr.length/2];
//        }

        System.out.println(sum);
    }
}
