package Recursion;

import java.util.ArrayList;

public class Permutations_without_repetations {
    public static void main(String[] args) {
        String st = "abac";
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
            boolean flag = false;
            char ch = question.charAt(i);
            for(int j = i+1 ; j < question.length() ; j++){
                if(ch == question.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }

            String prefix = question.substring(0 , i);
            String surfix = question.substring(i+1);
            char choose = question.charAt(i);
            permutations(prefix+surfix , ans+choose , list);
        }
    }
}
