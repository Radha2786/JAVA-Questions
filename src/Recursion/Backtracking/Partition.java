package Recursion.Backtracking;

import java.util.ArrayList;

public class Partition {
    public static void main(String[] args) {
        String st = "Radha";
//        part(st , "");
//        part2("aab" , new ArrayList<>());

        ArrayList<ArrayList<String>> ll = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        part3(st , list , ll);
        System.out.println(ll);
        System.out.println(list);
    }

    static void part(String question , String ans){
        if(question.isEmpty()){
            System.out.println(ans);
        }

        for(int i = 1 ; i <= question.length() ; i++){
            String p = question.substring(0 , i);

            part(question.substring(i) , ans+" " + p);
        }
    }

    static void part2(String question , ArrayList<String> list){
        if(question.isEmpty()){
            System.out.println(list);
        }

        for(int i = 1 ; i <= question.length() ; i++){
            String p = question.substring(0 , i);
            list.add(p);
            part2(question.substring(i) , list);
            list.remove(list.size()-1);
        }
    }

    static void part3(String question , ArrayList<String> list , ArrayList<ArrayList<String>> ll){
        if(question.isEmpty()){
//            System.out.println(list);
            ll.add(new ArrayList<>(list));
//            ll.add(list);
            return;
        }

        for(int i = 1 ; i <= question.length() ; i++){
            String p = question.substring(0 , i);
            list.add(p);
            part3(question.substring(i) , list , ll);
            list.remove(list.size()-1);
        }
    }
}
