package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Letter_combinations {
    public static void main(String[] args) {
        String st = "23";
        List<String> ans = new ArrayList<>();
        letter_combinations(st , "" , ans);
        System.out.println(ans);
    }

    static String[] choices_of_number = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tvu" , "wxyz"};

    static void letter_combinations(String digits , String ans , List<String> list){
        if(digits.isEmpty()){
            list.add(ans);
            return;
        }

        int digit = digits.charAt(0) - '0';
        String choice = choices_of_number[digit];

        for(int i = 0 ; i < choice.length() ; i++){
            letter_combinations(digits.substring(1) , ans+choice.charAt(i) , list);
        }
    }
}
