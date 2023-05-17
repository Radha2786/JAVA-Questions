package Coding_Blocks_Assignment;
import java.util.*;

public class Alex_goes_shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q = sc.nextInt();
        while(q-->0){
            int count =0,flag=0;
            int A = sc.nextInt();
            int K = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]<=A && arr[i]%A==0){
                    count++;
                    flag=count;
                }
            }
            if(flag>=K){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
