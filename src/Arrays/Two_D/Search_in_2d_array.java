package Arrays.Two_D;

import java.util.Scanner;

public class Search_in_2d_array {
    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        Scanner sc = new Scanner(System.in);
        int target = 65;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
             flag= BinarySearch(arr[i],target);
             if(flag==true){
                 break;
             }
        }
        if(flag){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }
    public static boolean BinarySearch(int[] arr,int target){
        int s=0;
        int e = arr.length-1;
        while(s<e){
            int mid= s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else {
                return true;
            }

        }
        return false;
    }
}
