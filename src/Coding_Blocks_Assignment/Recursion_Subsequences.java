package Coding_Blocks_Assignment;

import java.util.Scanner;

public class Recursion_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Subsequences(str,"");
        System.out.println();
        System.out.print(count);
    }
    static int count = 0;
    static void Subsequences(String str , String ans){
        if(str.isEmpty()){
            count++;
            System.out.print(ans+' ');
            return ;
        }
        // choose
        Subsequences(str.substring(1),ans+str.charAt(0));
        // not choose
        Subsequences(str.substring(1),ans);

    }
}
