package Coding_Blocks_Assignment;
import java.util.*;

public class Arrays_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(M>arr[mid]){
                s=mid+1;
            }else if(M<arr[mid]){
                e=mid-1;
            }else{
                // return mid;
                System.out.println(mid);
                break;
            }
        }
        System.out.println(-1);
    }
}
