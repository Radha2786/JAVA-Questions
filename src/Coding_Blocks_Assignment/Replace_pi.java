package Coding_Blocks_Assignment;

import java.util.Scanner;

public class Replace_pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            Replacement(str,0,"");
        }
    }
    static void Replacement(String str,int i,String ans){

        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)=='p' && str.charAt(i+1)=='i'){
            Replacement(str,i+2,ans+"3.14");
        }else{
            Replacement(str,i+1,ans+str.charAt(i));
        }

    }
}
