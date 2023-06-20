package STACK.Questions;
import java.util.*;

public class Valid_Anagram {
    public static void main(String[] args) {
        String str = "a";
        char[] ans= str.toCharArray();
        Arrays.sort(ans);
        System.out.println(ans);
        String t = "ab";
        char[] ans2= t.toCharArray();
        Arrays.sort(ans2);
        System.out.println(ans2);
        if(ans.length!=ans2.length){
//            return false;
            System.out.println(false);
            return ;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=ans2[i]){
                System.out.println(false);
//                break;
                return;
            }
        }
        System.out.println(true);
    }
}
