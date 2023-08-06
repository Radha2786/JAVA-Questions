package Contests;
import java.util.*;

public class Faulty_Keyboard {
    public static void main(String[] args) {
        String s ="poiinter";
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                str=reverse(str);
            }else{
                str+=s.charAt(i);
            }
        }
        System.out.println(str);
    }
    public static String reverse(String str){
        String nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        return nstr;
    }
}
