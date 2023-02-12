//First uppercase letter in a string (Iterative and Recursive)

package Recursion;

public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        String str=" geek";
        int i=0;
        Upper_letter(str,i);
    }
    static void Upper_letter(String str,int i){
        char ch = str.charAt(i);
        if(i>=str.length()-1){
            System.out.println("no uppercase letter");
            return;
        }
        if(ch>=65 && ch<=90){
            System.out.println(ch);
            return;
        }else{
            Upper_letter(str,i=i+1);
        }

    }
}
