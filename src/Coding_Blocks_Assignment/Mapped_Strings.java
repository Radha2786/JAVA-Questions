package Coding_Blocks_Assignment;
import java.util.*;

public class Mapped_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mapping(n,"");
    }
    static String[] words = {"","A","B","C","D","E","F","G","H","I","J","K","L","M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static void Mapping(int digit,String ans){
        if(digit<=0){
            char charArray[] = ans.toCharArray();
            Arrays.sort(charArray);
            System.out.println(new String(charArray));
//            Collection.sort(ans);
//            System.out.println(ans);
            return ;
        }
        int n = digit%10;
        String choice = words[n];
        Mapping(digit=digit/10,ans+choice);
        if(digit/10!=0){
            int m = digit%10;
//            String choice2=words[m*10+(digit/10)];
            String choice2=words[m*10+n];
//            digit=digit/10;
            Mapping(digit=digit/10,ans+choice2);
        }

    }
}
