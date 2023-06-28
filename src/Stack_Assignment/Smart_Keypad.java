package Stack_Assignment;

import java.util.Scanner;

public class Smart_Keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();
        Keypad_combination(digits,"");
    }

    static String key[] = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void Keypad_combination(String digits,String ans) {
        if(digits.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit = digits.charAt(0)-'0';
        String choices=key[digit];
        for(int i=0;i<choices.length();i++){
            Keypad_combination(digits.substring(1),ans+choices.charAt(i));
        }

    }


}
