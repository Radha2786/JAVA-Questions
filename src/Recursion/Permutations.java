package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String st = "aba";
//        String st = "abc";
        List<String> list = new ArrayList<>();
        permutation_with_no_repeatation(st , "" , list);
        System.out.println(list);
//        permutations(st , "" , list);
//        System.out.println(list);
    }

    static void permutations(String st , String ans , List<String> list){
        if(st.isEmpty()){
            list.add(ans);
            return;
        }

        for (int i = 0 ; i < st.length() ; i++){
            String prefix = st.substring(0 , i);
            String surfix = st.substring(i+1);
            char ch = st.charAt(i);
            permutations(prefix+surfix , ans+ch , list);
        }
    }

    static void permutation_with_no_repeatation(String st , String ans , List<String> list){
        if(st.isEmpty()){
            list.add(ans);
            return;
        }

        for (int i = 0 ; i < st.length() ; i++){
            char ch = st.charAt(i);
            boolean flag = false;
            for(int j = i+1 ; j < st.length() ; j++){
                if(st.charAt(j) == ch){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            String prefix = st.substring(0 , i);
            String surfix = st.substring(i+1);
            permutation_with_no_repeatation(prefix+surfix , ans+ch , list);
        }
    }
}
