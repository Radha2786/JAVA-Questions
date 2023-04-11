package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {
    public static void main(String[] args) {


    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n , 0 , 0 , "" , list);
        return list;
    }

    static void generate(int n , int open , int close , String ans ,  List<String> list){
//        BASE CONDITION
        if(open == n && close == n){
            list.add(ans);
            return;
        }

//        OPENING BRACKETS
        if(open < n){
            generate(n , open+1 , close , ans+'(' , list);
        }

//        CLOSING BRACKETS
        if(close < n && open < close){
            generate(n , open , close+1 , ans+')' , list);
        }
    }

}
