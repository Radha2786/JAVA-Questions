package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Permutations {
    public static void main(String[] args) {
        String st = "cab";
        ArrayList<String> list = new ArrayList<>();
        permutations(st , "" , list);
//        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).compareTo(st) < 0){
                System.out.println(list.get(i));
            }
            else{
                break;
            }
        }
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
