package Recursion;
import java.util.Scanner;
/*
Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by
his friend Ujjwal. The rules of the game are as follows:
Initially, there is an array, A , containing 'N' integers.
In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements
in the left part is equal  to the sum of the elements in the right part. If Vivek can make such a move, he gets '1'
point; otherwise, the game ends.
After each successful move, Vivek have to discards either the left part or the right part and continues playing by
using
the remaining partition as array 'A'.
Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the
maximum number of points he can score?
Input Format
First line of input contains an integer T denoting number of test cases. Each further Test case contains first line
an integer 'N' , the size of array 'A'. After that 'N' space separated integers denoting the elements of array.
Constraints
1 <= T <= 10 1 <= N <= 17000 0 <= A[i] <= 10^9
Output Format
For each test case, print Vivek's maximum possible score on a new line.
Sample Input
3
3
3 3 3
4
2 2 2 2
7
4 1 0 1 1 0 1
Sample Output
0
2
3
*/
public class Vivek_loves_array {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
              arr[i]= sc.nextInt();
            }
            System.out.println(loves_array(arr,0,arr.length-1));

        }
    }
    static int loves_array(int[] arr, int s,int e){
        int point =0;
        for(int mid =s ; mid<e ; mid++){
            int left =0;
            for(int i=s;i<=mid;i++){
                left+=arr[i];
            }
            int right=0;
            for(int i=mid+1;i<=e ;i++){
                right+=arr[i];
            }
            if(left==right){
                int f1=loves_array(arr,s,mid);
                int f2= loves_array(arr,mid+1,e);
                return Math.max(f1,f2)+1;

            }
        }
        return point;
    }
}
