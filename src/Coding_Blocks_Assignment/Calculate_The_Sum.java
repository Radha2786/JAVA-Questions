package Coding_Blocks_Assignment;
import java.util.*;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q = sc.nextInt();
        while(q-- >0){
            int[] brr = new int[arr.length];
            int x = sc.nextInt();
            for(int i=0;i<n;i++){
                int p=i-x;
                if(p<0){
                    brr[i]=arr[i]+arr[p+n];
//                    arr[i]+=arr[p+n];
                }else{
//                    arr[i]+=arr[p];
                    brr[i]=arr[i]+arr[p];
                }
            }
            arr=brr;
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum % 1000000007);

    }
}
