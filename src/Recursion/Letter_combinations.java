package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Letter_combinations {

    int a = 10;
    public static void main(String[] args) {
        String digits_pressed = "23";
        ArrayList<String> list = new ArrayList<>();
        phoneLetterCombinations(digits_pressed , "" , list);
        System.out.println(list);
    }

    static String[] digits_choices = { "" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};

    static void phoneLetterCombinations(String digits , String ans , ArrayList<String> list){
        if(digits.isEmpty()){
//            System.out.println(ans);
            list.add(ans);
            return;
        }
//        -> "23"
        int digit_pressed = digits.charAt(0) - '0';

        String choices_present_at_that_digit = digits_choices[digit_pressed];

        for(int i = 0 ; i < choices_present_at_that_digit.length() ; i++){
            char ch = choices_present_at_that_digit.charAt(i);
            phoneLetterCombinations(digits.substring(1) , ans+ch , list);
        }
    }
}
