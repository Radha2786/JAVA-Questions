package Contests;
import java.util.*;

public class Lexicographically_Smallest_String_After_Substring_Operation {
    public static void main(String[] args) {
       String s = "aa";
       String ans="";

        if(s.charAt(0)=='a' && s.charAt(s.length()-1)=='a'){
            int i=0;
            while( i<s.length() && s.charAt(i)=='a' ){
                ans+='z';
                i++;
            }
//            return ans;
            System.out.println(ans);
            return;
        }
//        System.out.println( Smallest_String(s,ans));
//        System.out.println((char)(s.charAt(1)-1));
//        System.out.println(ans);
        int index=0;
        for(int i=0;i<s.length();i++){
            if(i!=0 && s.charAt(i)=='a'){
                index=i;
                ans+='a';
                break;
            }else{
                if( s.charAt(i)=='a'){
                    ans+='a';
                }else{
                    ans+=(char)(s.charAt(i)-1);
                }

            }
        }
        if(index!=0) {


            for (int i = index + 1; i < s.length(); i++) {
                ans += (char) (s.charAt(i));
            }
        }
        System.out.println(ans);
    }
    public static String Smallest_String(String str, String ans){
        if (str.isEmpty()){
//            System.out.println(ans);
            return ans;
        }
//        int i = str.charAt(0);
        if(str.charAt(0)=='a'){
          return Smallest_String(str.substring(1),ans+str.charAt(0));
        }else{
            return Smallest_String(str.substring(1),ans+(char)(str.charAt(0)-1));
        }

    }
}
