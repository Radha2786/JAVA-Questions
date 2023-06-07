package Rivision_Recursion;
import java.util.*;

//public class Subset_problem {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int target = sc.nextInt();
//        Total_Subsets(arr,target);
//    }
//    static void Total_Subsets(int[] arr , int target){
//        if(sum==target){
//            System.out.println(str);
//        }
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//            Total_Subsets(arr);
//        }
//        Total_Subsets(arr,target,);
//
//    }


public class Subset_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter target");

//        System.out.println("enter number");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
//        int count=0;
        int t = Subset(0,arr,target,"");
        System.out.println();
        System.out.println(t);
    }
    static int Subset(int index,int[] arr,int target,String ans){

        int count = 0;
        if(target==0){
//            count++;
            System.out.print(ans+" ");
            return 1;
        }
        if(target<0){
            return 0;
        }

        for(int i=index;i<arr.length;i++){
            count += Subset(i+1,arr,target-arr[i],ans+arr[i]+" ");
        }

        return count;
//        System.out.println(count);
    }
}

