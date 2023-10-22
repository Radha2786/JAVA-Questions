package HashMap_Heap_Assignment;

//Given an array arr of n length. You will be given Q queries for the array.
//        Each query contains a number N.You have to determine whether a number exist in the array or not

import java.util.HashSet;
import java.util.Scanner;

public class Exist_OR_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input no. of test cases");
        int T =sc.nextInt();
        System.out.println("input size of the array");
        while(T-->0) {
            int L = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < L; i++) {
                set.add( sc.nextInt());
            }
            System.out.println("enter number of queries");
            int Q = sc.nextInt();
            System.out.println("enter numbers to be searched in the array");
            while(Q-->0){
                int N = sc.nextInt();
                if (set.contains(N)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }

    }

}
