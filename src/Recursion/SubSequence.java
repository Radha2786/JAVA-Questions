package Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String st = "abc";
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        subsequence(st , "" , list);
        System.out.println(list);
    }

    static void subsequence(String question , String ans , ArrayList<String> list){
        if(question.isEmpty()){
            list.add(ans);
            return;
        }

        char ch = question.charAt(0);
        // not choose
        subsequence(question.substring(1) , ans , list);
        // choose
        subsequence(question.substring(1) , ans+ch , list);

    }

}
