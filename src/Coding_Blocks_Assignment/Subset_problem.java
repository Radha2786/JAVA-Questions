package Coding_Blocks_Assignment;
import java.util.*;

//Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
//a. Write a recursive function which prints subsets of the array which sum to target.
//b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

//Input Format
//        Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

//Display the number of subsets and print the subsets in a space separated manner.
//
//        Sample Input
//        3
//        1
//        2
//        3
//        3
//        Sample Output
//        1 2  3
//        2
//        Explanation
//        Add 2 spaces between 2 subset solutions

public class Subset_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter target");
        int target= sc.nextInt();
//        System.out.println("enter number");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int count=0;
        int t = Subset(1,arr,target,"");
        System.out.println();
        System.out.println(t);


    }
    static int Subset(int index,int[] arr,int target,String ans){

        int count = 0;
        if(target==0){
//            count++;
            System.out.print(ans+"  ");


            return 1;
        }
        if(target<0){
            return 0;
        }

        for(int i=index;i<=arr.length;i++){
            count += Subset(i+1,arr,target-arr[i],ans+i+" ");
        }

        return count;
//        System.out.println(count);
    }

}
