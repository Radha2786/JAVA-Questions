package LEETCODE;
// leetcode biweekly contest

public class PrimeInDiagonal {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{5,6,7},{9,10,11}};
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j || i + j == nums.length - 1) {
                    int n = nums[i][j];
                    boolean isPrime = true;
                    for (int k = 2; k * k <= n; k++) {
                        if (n % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        if (n > max) {
                            max = n;
                        }

                    }


                }
            }
        }
//        return max;
        System.out.println(max);
    }
}
