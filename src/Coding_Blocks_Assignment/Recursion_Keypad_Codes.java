package Coding_Blocks_Assignment;
import java.util.*;

public class Recursion_Keypad_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();

        Possible_words(str,"",list);
        System.out.println( list);
        System.out.println(count);
    }
    static String[] choices_of_numbers ={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    static int count=0;
    static void Possible_words(String digits , String ans , ArrayList<String> list){
        if(digits.isEmpty()){
            list.add(ans);
            count++;
            return ;
        }
        int digit = digits.charAt(0)-'0';
        String choice = choices_of_numbers[digit];
        for(int i=0;i<choice.length() ; i++) {
            Possible_words(digits.substring(1), ans +choice.charAt(i),list);
        }

    }
}
