package Recursion.Backtracking;

import java.util.ArrayList;

public class Palindrome_Partitioning_131 {
    public static void main(String[] args) {

        String st = "aab";

        ArrayList<ArrayList<String>> ll = new ArrayList<>();

        part2(st , new ArrayList<>() , ll);
        System.out.println(ll);
    }

    static void part2(String question , ArrayList<String> list, ArrayList<ArrayList<String>> ll){
        if(question.isEmpty()){
//            System.out.println(list);
            ll.add(new ArrayList<>(list));
        }

        for(int i = 1 ; i <= question.length() ; i++){
            String p = question.substring(0 , i);
            if(isPalindrome(p)){
                list.add(p);
                part2(question.substring(i) , list , ll);
                list.remove(list.size()-1);
            }
        }
    }
    static boolean isPalindrome(String st){
        int s = 0;
        int e = st.length()-1;

        while (s < e){
            if(st.charAt(s) != st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
