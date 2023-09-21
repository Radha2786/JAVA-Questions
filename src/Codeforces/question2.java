package Codeforces;
import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int k=0;k<n;k++){
                arr[k]=sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int minindex=0,product=1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                    minindex=i;
                }
            }
            arr[minindex]=min+1;
            for(int j=0;j<arr.length;j++){
                product*=arr[j];
            }
            System.out.println(product);
        }
    }
}