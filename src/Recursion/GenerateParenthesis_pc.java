package Recursion;

import java.util.ArrayList;

public class GenerateParenthesis_pc {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> list = new ArrayList<>();
        Parentheses(n,n,n,"",list);
        System.out.println(list);

    }
    static void Parentheses(int n , int open, int close, String ans, ArrayList<String>list){
        // opening call
        if(open==0 && close==0){
            list.add(ans);
            return;
        }
        if(open>0){
            Parentheses(n,open-1,close,ans+'(',list);
        }
        // close call
        if(close>0 && open<close){
            Parentheses(n,open,close-1,ans+')',list);
        }

    }
}
