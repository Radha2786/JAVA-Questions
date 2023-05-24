package Strings;
import java.util.*;
public class Strings_Remove_Duplicates {
    public static void main(String[] args) {
        String str = "aabccba";
        int p1=0,p2=0;
        String str1="";
        while(p2<str.length()){
            if(str.charAt(p1)!=str.charAt(p2)){
                str1=str1+str.charAt(p1);
                p1=p2;
            }
            p2++;
        }
        if(str.charAt(p1)==str.charAt(p2-1)){
            str1=str1+str.charAt(p2-1);
        }
        System.out.println(str1);

    }
}
