package Contests;
import java.util.*;

public class Remove_Trailing_Zeros_From_a_String {
    public static void main(String[] args) {
        String str =  "51230100";

//        System.out.println(51230100/10);
        int i = str.length()-1;
        int count=0;
        while(i>=0){
            if(str.charAt(i)==48){
                count++;
                i--;
            }else{
                break;
            }
        }

        int n = str.length()-count;
        String ans ="";
        for(int j=0;j<n;j++){
            char ch = str.charAt(j);
            ans+= (char)(ch);
        }
        System.out.println(ans);
    }
}
