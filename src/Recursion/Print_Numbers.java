//to print pattern like
//5 4 3 2 1 1 2 3 4 5

package Recursion;
import java.util.*;
public class Print_Numbers {
    public static void main(String[] args) {
//        int n =5;
//        IO(n);
        int[] arr = {2,3,7,3,3,7,6,3};
        ArrayList<Integer> ans = new ArrayList<>();
//        int target= 11;
//        int index=0;
        search(arr,3,0,ans);
        System.out.println(ans);
    }
    static void IO(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        IO(n-1);
        System.out.println(n);
    }
//below method search all the occurances of any number (3)
    static void search(int[] arr , int target, int index,ArrayList<Integer> ans){

        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
//            return index;
//            System.out.println(index);
            ans.add(index);
        }

        search(arr,target,index+1,ans);
    }
}
