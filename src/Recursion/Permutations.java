package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String st = "abc";
        ArrayList<String> list = new ArrayList<>();
        permutations(st , "" , list);
        System.out.println(list);

    }
    static void permutations(String question , String ans , ArrayList<String> list){
        if(question.isEmpty()){
            list.add(ans);
            return;
        }
        for(int i = 0 ; i < question.length() ; i++){
            String prefix = question.substring(0 , i);
            String surfix = question.substring(i+1);
            char choose = question.charAt(i);
            permutations(prefix+surfix , ans+choose , list);
        }
    }
}
